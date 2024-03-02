package com.example.demo.laptopCont;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;

@RequestMapping("/laptop")
@RestController
public class LaptopController
{
	Laptop lap;

	@PostMapping
	public  String createLaptop(@RequestBody Laptop lap) {
		this.lap=lap;
		return "SuccessFully Laptop created";
	}
	
	@GetMapping(value="{srNo}")
	 public Laptop readLaptop(@PathVariable String srNo) {
		return lap;
	}
	
	@PutMapping
	public String updateLaptop(@RequestBody Laptop lap) {
		this.lap=lap;
		return "SuccessFully updated";
	}
	
	@DeleteMapping(value="{srNo}")
	public String deleteLaptop(@PathVariable String srNo) {
		lap=null;
		return "SuccessFully deleted";
	}
	
	
	
	
	
	
	
	
	
	
	
}
