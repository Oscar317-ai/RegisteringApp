package com.page.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.page.one.entity.Student;
import com.page.one.service.StudentService;



@Controller
public class StudentController {
	
	private final StudentService studentService;
	
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/")
	public String getPage(Model model) {
		List<Student> students = studentService.listAll();
		model.addAttribute("student", new Student());
		return "register";
	}
	
	
	@PostMapping("/register")
	public String registerMsee(@ModelAttribute("student") Student student) {
		
		String firstName = student.getFirstName();
        String lastName = student.getLastName();
        
        String email = student.getEmail();
        String password = student.getPassword();
        
        // STORE USER.
        Student saved = new Student(firstName, lastName, email, password);
        studentService.saveStudent(saved);
        // END OF STORE USER.
		return "register";
	}

	

}
