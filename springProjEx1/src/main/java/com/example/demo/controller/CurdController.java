package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping("/curd")
public class CurdController
{
	
	@GetMapping(value = "{kId}")
  public Student getInfo(@PathVariable String kId) {
	  Student s= new Student(kId,"ashiu",20);
	  
	  
	  return s;
  }
	
}
