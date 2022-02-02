package com.springorm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class Student {
	
	
	@Id
	@Column(name = "std_id")
	private int studentid;
	@Column(name = "std_name")
	private String studentname;
	@Column(name = "std_city")
	private String studentcity;
	
	
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	public Student(int studentid, String studentname, String studentcity) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentcity = studentcity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	
}
