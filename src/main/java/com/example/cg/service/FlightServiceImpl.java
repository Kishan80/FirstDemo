package com.example.cg.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cg.entity.Flight;
import com.example.cg.repo.FlightRepo;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepo repo;

	@Override
	public int addFlight(Flight flight) {
		repo.save(flight);
		return flight.getFlightNo();
	}

	@Override
	public List<Flight> getAll() {
		return (List) repo.findAll();
	}

	@Override
	public Flight getByFlightNo(int no) {
		return repo.findById(no).orElseThrow();
	}

	@Override
	public void removeFlight(int no) {
		repo.deleteById(no);
	}

	@Override
	public void updateFlight(Flight flight) {
		repo.save(flight);

	}

}
