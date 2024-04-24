package com.kpit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hotelRm")
@Scope("prototype") // for multiple rooms (singleton for one)
public class HotelRoom {
	public HotelRoom() {
		System.out.println("HotelRoom ctor....");
	}
	void enjoyTV() {
		System.out.println("Enjoying tv....");
	}
}
