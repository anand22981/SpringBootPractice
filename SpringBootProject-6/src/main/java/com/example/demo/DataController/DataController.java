package com.example.demo.DataController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController 
{

	@GetMapping("/viewI")
	public String viewInfo() {
		return "viewinfo";
	}
}
