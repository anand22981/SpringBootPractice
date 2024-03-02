package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController 
{

	BikeService bikesev;

	public BikeController(BikeService bikesev) {
		super();
		this.bikesev = bikesev;
	}
	
	
	//creating and storing the bike object
	@PostMapping
	public String addBike(@RequestBody Bike b) {
		String msg=bikesev.addBike(b);
		return msg;
	}
	//featching specific the bike object

	//fetching all the bike object
	
	//updating a bike object 
	
	//deleting a bike object
	
	
	
	
	
	
	
	
	
}
