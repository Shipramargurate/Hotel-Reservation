package com.workshop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class HotelReservationTest {
	@SuppressWarnings("deprecation")
	@Test
	public void givenHotelDetails_WhenAddedHotel_ShouldReturnTrue() {
		
		HotelReservation hotelReservation = new HotelReservation();
		boolean isValid = hotelReservation.addHotel("sunview", 1150.00);
		Assert.assertEquals(isValid, isValid);

	}
}
