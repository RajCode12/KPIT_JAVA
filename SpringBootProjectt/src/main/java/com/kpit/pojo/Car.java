package com.kpit.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Scope("prototype")
@Entity
@Table(name="CarTable")
public class Car {
	@Id
	@Column(name="car_number")
	private int carNumber;
	
	@Column(name="car_name")
	private String carName;
	
	@Column(name="car_price")
	private float carPrice;
	
	public Car() {
		super();
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carName=" + carName + ", carPrice=" + carPrice + "]";
	}

}
