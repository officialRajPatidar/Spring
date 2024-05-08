package com.springcore.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper; // Import RowMapper interface
import com.springjdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student> { // Implement RowMapper interface with type Student

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));
        return student;
    }
}
