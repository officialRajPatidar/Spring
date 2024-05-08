package com.springcore.com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springcore.com.entity.Student;


public class StudentDao {

	
	private HibernateTemplate hibernatetemp;
	
	@Transactional
	public int insert(Student student) {
	Integer i =(Integer) this.hibernatetemp.save(student);
	return i;
	}


	public Student getStudent(int student) {
	Student stu=	this.hibernatetemp.get(Student.class, student);
		
		return stu;
		
	}
	
	public List<Student> getAllStudents(){
		List<Student> stu = this.hibernatetemp.loadAll(Student.class);
		return stu;
	}
	@Transactional
	public void delete(int studentId) {
	Student stu =	this.hibernatetemp.get(Student.class, studentId);
		this.hibernatetemp.delete(stu);
	}
	
	@Transactional
	public void update(Student student) {
  this.hibernatetemp.update(student);
	}
	
	
	
	/**
	 * @return the hibernatetemp
	 */
	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}


	/**
	 * @param hibernatetemp the hibernatetemp to set
	 */
	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}
	
	
	
}
