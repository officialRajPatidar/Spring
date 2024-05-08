package com.springcore.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.com.dao.StudentDao;
import com.springcore.com.entity.Student;

import antlr.collections.List;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/com/config.xml");
		StudentDao stuDao = (StudentDao) context.getBean("studentDao");

//        Student stu = new Student(456, "raj pati", "indore");
//        int r = stuDao.insert(stu);
//        System.out.println("done" + r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("press 1 for add new student");
			System.out.println("press 2 for display all student");
			System.out.println("press 3 for get detauls of single student");
			System.out.println("press 4 for update student");
			System.out.println("press 5 for delete student");
			System.out.println("press 6 for exit");

			try {

				int choice = Integer.parseInt(br.readLine());

				switch (choice) {
				case 1:
                    System.out.println("enter userid");
                    int id = Integer.parseInt(br.readLine());
                    
                    System.out.println("enter username");
                    String name = br.readLine();
                    
                    System.out.println("enter usercity");
                    String city = br.readLine();
                    
                    
                    Student s = new Student();
                    s.setStId(id);
                    s.setStName(name);
                    s.setStCity(city);
                  int r=   stuDao.insert(s);
                    System.out.println("student added"+r);
                    System.out.println("******************************************************************");
					break;
				case 2:
                  //diplay all
					
				java.util.List<Student> allStudents = stuDao.getAllStudents();
				for(Student s1: allStudents) {
                    System.out.println("******************************************************************");

					System.out.println("id: "+s1.getStId());
					System.out.println("name: "+s1.getStName());
					
					System.out.println("city: "+s1.getStCity());
                    System.out.println("******************************************************************");

				}
					break;
				case 3:
					System.out.println("enter userid");
                    int uid = Integer.parseInt(br.readLine());
                    Student student = stuDao.getStudent(uid);
                    System.out.println("******************************************************************");

					System.out.println("id:"+student.getStId());
					System.out.println("name:"+student.getStName());
					
					System.out.println("city"+student.getStCity());
                    System.out.println("******************************************************************");
					break;
				case 4:
//updateing data
					System.out.println("enter userid");
                    int uId = Integer.parseInt(br.readLine());
                    
                    System.out.println("enter username");
                    String uName = br.readLine();
                    
                    System.out.println("enter usercity");
                    String uCity = br.readLine();
                    
                    
                    Student s1 = new Student();
                    s1.setStId(uId);
                    s1.setStName(uName);
                    s1.setStCity(uCity);
                   stuDao.update(s1);
                    System.out.println("student updated");
                    System.out.println("******************************************************************");
					break;
				case 5:
					 //delte
					System.out.println("enter userid");
                    int userid = Integer.parseInt(br.readLine());
                   stuDao.delete(userid );
                   System.out.println("stident delteted");
	                    
					break;

				case 6:
					go = false;
					break;

				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("invalid input try with another one");
				System.out.println(e.getMessage());
			}
		}System.out.println("thank you for using my application will see you soon");

	}
}
