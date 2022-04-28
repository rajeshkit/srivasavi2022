package com.sms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.model.Student;
import com.sms.service.StudentService;


@Controller
public class StudentController {
	
	private StudentService studentService;
	
	
	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/")
	public String welcome() {
		return "index"; // /view/jsp/index.jsp
	}
	
	@RequestMapping("/greet")
	public ModelAndView greeting() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("studentinfo");
		mav.addObject("name", "Rajesh");
		return mav;
	}
	
	@RequestMapping("/register")
	public String loadRegistrationForm(Model model) {
		model.addAttribute("s", new Student());
		return "registrationform"; // /view/jsp/registrationform.jsp
	}
	@RequestMapping("/registerstudent")
	public ModelAndView registerStudent(@ModelAttribute("s") Student student) {
//		System.out.println(request.getParameter("StudentName"));
//		System.out.println(request.getParameter("StudentPassword"));
//		System.out.println(request.getParameter("StudentPhone"));
//		System.out.println(request.getParameter("StudentEmail"));
//		Student s=new Student();
//		s.setStudentName(request.getParameter("StudentName"));
//		s.setStudentPassword(request.getParameter("StudentPassword"));
//		s.setStudentEmail(request.getParameter("StudentEmail"));
//		s.setStudentPhone(request.getParameter("StudentPhone"));
		int status = studentService.registerStudent(student);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("registrationsuccess");
		mav.addObject("name",student.getStudentName());
		return mav;
	}
	@RequestMapping("/students")
	public ModelAndView getAllStudents() {
		List<Student> list=studentService.getAllStudents();
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentList", list);
		mav.setViewName("showstudents");
		return mav;
	}
	
	@RequestMapping("/delete")
	public String loanStudentDeleteForm() {
		return "deleteform";
	}
	
	@RequestMapping("/deletestudent")
	public String deleteStudentById(HttpServletRequest request) {
		int sId=Integer.parseInt(request.getParameter("studentId"));
		studentService.deleteStudentById(sId);
		return "redirect:/students";
	}
	
	
	
	
	
	
}
