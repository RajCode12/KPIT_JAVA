package com.kpit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.pojo.Car;

import car.kpit.repo.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	CarRepository carRepo;
	
	@Override
	public void createNewCarService(Car car) {
		
		carRepo.save(car); // tell the repo to save the object
	}
}
