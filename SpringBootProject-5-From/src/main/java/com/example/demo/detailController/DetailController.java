package com.example.demo.detailController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dti")
@RestController
public class DetailController 
{
@PostMapping
public String acceptiDetail(@RequestParam String name, @RequestParam String email,@RequestParam String pass,@RequestParam String gender,@RequestParam long mobile) 
{
	String detail="person name is "+name+" email id : "+ email+" password is: "+ pass +" Gender is: "+gender+" Contact info : "+mobile;
	return detail;
}
}
