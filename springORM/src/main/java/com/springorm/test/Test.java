package com.springorm.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
		  StudentDao stddao =  con.getBean("studentdao",StudentDao.class);
		  
		  /*for insert student*/
		  
		  Student std = new Student(789,"ram sharma","kolkata"); 
		  
		  int r = stddao.insert(std);
		  
		  System.out.println("inserted"+r);
		  
		  
		  /*for getting list student*/
		  
		/* List<Student> list =  stddao.getallstudent();
		 for (Student st : list) {
			System.out.println(st.getStudentid());
			System.out.println(st.getStudentname());
			System.out.println(st.getStudentcity());
		} */
		  
		  
		 /*for getting single student*/
		 
		/*Student stt =  stddao.getstudent(789);
		
				System.out.println(stt.getStudentid());
				System.out.println(stt.getStudentname());
				System.out.println(stt.getStudentcity());*/
				
				
		  /*for delete student*/
		  
		  /*stddao.delete(789);
		  System.out.println("record deleted");*/
		  
		 
		  /*for update student*/
		  
		 /* Student std = new Student(456,"ritik","mumbai"); 
		  stddao.update(std);*/
		  
	}

}
