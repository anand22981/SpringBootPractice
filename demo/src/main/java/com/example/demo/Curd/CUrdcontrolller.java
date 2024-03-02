package com.example.demo.Curd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CUrdcontrolller {
	@GetMapping("/create")
	public String create() {
		return "Created";
	}
	
	@GetMapping("/read")
	public String read() {
		return "Read";
	}
	@GetMapping("/update")
	public String update() {
		return "Update";
	}
	@GetMapping("/delete")
	public String delete() {
		return "Delete";
	}

}
