package com.example.FlightBookingApplication.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.FlightBookingApplication.Database.FlightList;
import com.example.FlightBookingApplication.Entity.Flight;

@Component
public class FlightRepository {
	
	@Autowired
	FlightList flightList;
	
	public List<Flight> getAllFlightList(){
		return flightList.getAllFlights();
	}
}
