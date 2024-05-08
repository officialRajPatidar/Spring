package com.springcore.jdbc.dao;

import java.util.List;

import com.springjdbc.entities.Student;

public interface StudentDao {

	public int insert(Student student);
	public int update(Student student );
	public int delete(int studentID);
	public Student getData(int studentId);
	
	public List <Student> getAllStudents();
	
}
