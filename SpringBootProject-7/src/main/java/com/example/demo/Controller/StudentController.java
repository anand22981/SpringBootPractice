package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.StudentService;

@Controller
public class StudentController 
{
 
	@Autowired
	StudentService sr;
	
	@GetMapping("/studcrud")
	public String getAllStudents(Model model)
	{
		model.addAttribute("students",sr.getAllStudents());
		return "viewstudents";
	}
	
	
	
}
