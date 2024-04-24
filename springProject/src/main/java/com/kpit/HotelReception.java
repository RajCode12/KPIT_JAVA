package com.kpit;

import org.springframework.stereotype.Component;

@Component("hotelRec") // use to avoid writing bean tag in spring.xml
public class HotelReception {
	public HotelReception() {
		System.out.println("HotelReception ctor....");
	}
	void checkRooms() {
		System.out.println("Checking the available rooms...");
	}
	void billing() {
		System.out.println("Billing for the room....");
	}
}
