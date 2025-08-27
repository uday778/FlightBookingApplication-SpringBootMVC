package com.example.FlightBookingApplication.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.FlightBookingApplication.Entity.Flight;

@Component
public class SimpleFlightList implements FlightList{
	List<Flight> listOfFlight = new ArrayList<Flight>();
	
	public SimpleFlightList() {
		listOfFlight.add(new Flight("FL001", "LA", "Stockholm"));
		listOfFlight.add(new Flight("FL002", "LA", "Stockholm"));
		listOfFlight.add(new Flight("FL003", "LA", "Texas"));
		listOfFlight.add(new Flight("FL004", "Delhi", "Bengaluru"));
		listOfFlight.add(new Flight("FL005", "Sydney", "Miami"));
		listOfFlight.add(new Flight("FL006", "Wales", "Cambridge"));
		listOfFlight.add(new Flight("FL007", "Michigan", "Delhi"));
		listOfFlight.add(new Flight("FL008", "Wisconsin", "Indore"));
		listOfFlight.add(new Flight("FL009", "Dallas", "LA"));
		listOfFlight.add(new Flight("FL0010", "NY", "LA"));
		listOfFlight.add(new Flight("FL0011", "bengaluru", "Las Vegas"));
		listOfFlight.add(new Flight("FL0012", "Pune", "Hyderabad"));
		listOfFlight.add(new Flight("FL0013", "Brisabne", "Adelaide"));
	}
	
	
	@Override
	public List<Flight> getAllFlights() {
		return this.listOfFlight;
	}

}
