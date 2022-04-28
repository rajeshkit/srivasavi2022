package com.sms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int studentId;
	private String StudentName;
	private String StudentPassword;
	private String StudentPhone;
	private String StudentEmail;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentPassword() {
		return StudentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		StudentPassword = studentPassword;
	}
	public String getStudentPhone() {
		return StudentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	
}
