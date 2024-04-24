package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.pojo.Car;

import car.kpit.repo.CarRepository;

@SpringBootTest
public class CarRepositoryTesting {
	@Autowired
	CarRepository carRepo;
	
	@Autowired
	Car carObj;
	 
	@Test
	public void createCarTest() {
		carObj.setCarNumber(1001);
		carObj.setCarName("Audi");
		carObj.setCarPrice(2000000.0f);
		carRepo.save(carObj);
	}
	
}