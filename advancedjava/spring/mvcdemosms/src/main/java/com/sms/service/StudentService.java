package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sms.model.Student;
import com.sms.repository.StudentRepository;
@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	public int registerStudent(Student s) {
		
		return studentRepository.registerStudent(s);
	}
	public List<Student> getAllStudents(){
		return studentRepository.getAllStudents();
	}
	public void deleteStudentById(int sId) {
		studentRepository.deleteStudentById(sId);
	}
}
