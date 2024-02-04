package com.page.one.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.page.one.entity.Student;
import com.page.one.repository.StudentRepo;


@Service
public class StudentService {
	
	private final StudentRepo repo;
	
	@Autowired
	public StudentService(StudentRepo repo) {
		this.repo = repo;
	}

	public Student saveStudent(Student scholar) {
		return repo.save(scholar);
	}

	public List<Student> listAll() {
		return null;
	}
	

}
