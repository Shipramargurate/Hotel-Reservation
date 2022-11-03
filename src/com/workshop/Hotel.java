package com.workshop;

public class Hotel {
	private String hotelName;
	private double regularCustomerRate;
	
	public Hotel() {}
	
	public Hotel(String hotelName, double regularCustomerRate) {
		super();
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRegularCustomerRate() {
		return regularCustomerRate;
	}

	public void setRegularCustomerRate(double regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}
	
	
	
	
}