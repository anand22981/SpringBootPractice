package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService
{

	@Autowired
	StudentRepository sr;
	
	@Override
	public List<Student> getAllStudents() 
	{
		
		return sr.findAll();
	}
	
	 
	

}
