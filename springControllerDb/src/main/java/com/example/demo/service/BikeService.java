package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bike;

public interface BikeService 
{
     String addBike(Bike b);
     
     Bike getBike(String engNo);
     
     List<Bike>getAllBike();
     
     String updateBike(Bike b);
     
     String deleteBike(String engNo);
     
     
}
