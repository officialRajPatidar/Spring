package com.springcore.jdbc.dao;



import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		//insert query
		  String query = "insert into student(id,name,city) values(?,?,?)";
       int r = this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	
	@Override
	public int update(Student student) {
		// query to update data in db 
		String query= "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	

	
	
	
	
	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int delete(int studentId) {

		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}


	
	//selecting query
	@Override
	public Student getData(int studentId) {
		
		String query = "select * from student where id =?";
		
	RowMapper<Student>	rowMapper= (RowMapper<Student>) new RowMapperImpl();
	Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
	
	return student ;
	}


	//get all the student
	@Override
	public List<Student> getAllStudents() {
		//selecting multiple student
		String query = "select * from student ";
		List <Student> students= this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return students;
	}


	

	

}
