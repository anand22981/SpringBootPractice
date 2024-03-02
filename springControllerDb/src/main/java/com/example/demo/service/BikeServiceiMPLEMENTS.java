package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repositories.BikeRepository;

@Service
public class BikeServiceiMPLEMENTS implements BikeService
{
   
	BikeRepository bkrepo;

	public BikeServiceiMPLEMENTS(BikeRepository bkrepo) {
		super();
		this.bkrepo = bkrepo;
	}

	@Override
	public String addBike(Bike b) {
		// TODO Auto-generated method stub
		bkrepo.save(b);
		return "added bike";
	}

	@Override
	public Bike getBike(String engNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getAllBike() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBike(Bike b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBike(String engNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
