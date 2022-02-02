package com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entity.Student;

public class StudentDao {
	
	 private HibernateTemplate hibernateTemplate; ;
	

	@Transactional
	public int insert(Student std){	
	Integer i = (Integer) this.hibernateTemplate.save(std);
		
		return i;	
	}
	
	public Student getstudent(int studentid){
		Student std = this.hibernateTemplate.get(Student.class,studentid);
		return std;
	}

	
	public List<Student> getallstudent(){
		List<Student> list = this.hibernateTemplate.loadAll(Student.class);
		return list;
		
	}
	
	@Transactional
	public void delete(int studentid){
	Student std = 	this.hibernateTemplate.get(Student.class,studentid);
		this.hibernateTemplate.delete(std);
		
	}
	
	@Transactional
	public void update(Student std){
		
		this.hibernateTemplate.update(std);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	
	
	
}
