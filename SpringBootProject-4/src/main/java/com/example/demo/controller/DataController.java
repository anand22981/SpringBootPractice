package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dc")
@RestController
public class DataController 
{
 
	@PostMapping
	public String acceptData(@RequestParam String data,@RequestParam int sub1,@RequestParam int sub2,@RequestParam int sub3,@RequestParam int sub4,@RequestParam int sub5) {
		float total=(sub1+sub2+sub3+sub4+sub5);
		float percentage=(total*100/500);
		return (data +" got percentage:"+(percentage));
	}
	
	
	
	
}
