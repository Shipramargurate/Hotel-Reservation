package com.workshop;

import java.util.*;

public class HotelReservation {

	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	
	public boolean addHotel(String hotelName, double regularCustomerRate) {
		Hotel hotels = new Hotel();
		hotels.setHotelName(hotelName);
		hotels.setRegularCustomerRate(regularCustomerRate);
		hotelList.add(hotels);
		return true;
	}
	

}
