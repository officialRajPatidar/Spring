package com.springcore;

import java.util.List;

import javax.sql.rowset.serial.SQLOutputImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
       
   StudentDao studentDao =  context.getBean("studentDao",StudentDao.class);  
 
   // datta insert code
//   Student student = new Student();
//   student.setId(852);
//   student.setName("rambabu");
//   student.setCity("mugaoli");
//   int res = studentDao.insert(student);
//   System.out.println("student added" + res);
   
   
   
   //update code
//   Student student = new Student();
//   student.setId(852);
//   student.setName("chotu");
//   student.setCity("sehore");
//   int res = studentDao.update(student);
//    System.out.println("student are updated..!");
   
   
//delete code
//   int res = studentDao.delete(234);
//   System.out.println("data is deleted...!");
   
   
   
   //get the data
//   Student stu = studentDao.getData(852);
//   System.out.println(stu);
   
   
    List<Student> students = studentDao.getAllStudents();
    for(Student s: students) {
    	System.out.println(s);
    }
    }
}
