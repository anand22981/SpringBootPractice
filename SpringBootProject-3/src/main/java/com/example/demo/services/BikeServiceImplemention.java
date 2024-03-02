package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repositories.BikeRepository;

@Service
public class BikeServiceImplemention implements BikeService
{
	BikeRepository bkrepo;

	public BikeServiceImplemention(BikeRepository bkrepo) {
		super();
		this.bkrepo = bkrepo;
	}

	@Override
	public String addBike(Bike b) {
		bkrepo.save(b);
		return "Bike is added";
	}

	@Override
	public Bike getBike(String engNo) {
		Bike b=bkrepo.findById(engNo).get();
		return b;
	}

	@Override
	public List<Bike> getBikeall() {
		List<Bike>blist=bkrepo.findAll();
		return blist;
	}

	@Override
	public String updateBike(Bike b) {
		
		// TODO Auto-generated method stub
		bkrepo.save(b);
		return "bike get Updated";
	}

	@Override
	public String deleteBike(String engNo) {
		// TODO Auto-generated method stub
		bkrepo.deleteById(engNo);
		return "Bike deleted";
	}
	
}
