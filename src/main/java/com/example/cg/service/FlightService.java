package com.example.cg.service;

import java.util.List;

import com.example.cg.entity.Flight;

public interface FlightService {

	int addFlight(Flight flight);

	List<Flight> getAll();

	Flight getByFlightNo(int no);

	void removeFlight(int no);

	void updateFlight(Flight flight);
}
