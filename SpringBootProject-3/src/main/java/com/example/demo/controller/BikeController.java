package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.services.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController 
{
 
	BikeService bikesrv;

	public BikeController(BikeService bikesrv) {
		super();
		this.bikesrv = bikesrv;
	}
	
	//creating and storing object for bike class
	@PostMapping
	public String addBike(@RequestBody  Bike b) {
		String msg=bikesrv.addBike(b);
		return msg;
	}
	//fetching a specific bike object
	@GetMapping(value="{engNo}")
	public Bike getBike(@PathVariable String engNo) {
		Bike b=bikesrv.getBike(engNo);
		return b;
	}
	//fetching all the bike objects
	@GetMapping
	public List<Bike> getBikeall() {
		List<Bike> blist=bikesrv.getBikeall();
		return blist;
	}
	//update bike object 
	@PutMapping
	public String updateBike( @RequestBody Bike b) {
		String msg= bikesrv.updateBike(b);
		return msg;
	}
	//delete bike object
	@DeleteMapping(value="{engNo}")
	public String deleteBike(@PathVariable String engNo) {
		String msg=bikesrv.deleteBike(engNo);
		return msg;
	}
	
	
	
	
	
}
