package com.example.cg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cg.entity.Flight;
import com.example.cg.service.FlightService;



@RestController
public class FlightController {
	
	@Autowired
	private FlightService service;
	
	@GetMapping(value = "/getAllFlight", produces = "application/json")
	public List<Flight> getAll() {
		return service.getAll();
	}
	
	@GetMapping(value = "/getFlight/{no}", produces = "application/json")
	public Flight get(@PathVariable int no){
		return service.getByFlightNo(no);
		
	}

	@PostMapping(value = "/addFlight", consumes = "application/json")
	public String add(@RequestBody Flight flight) {
		service.addFlight(flight);
		return "Flight saved";
	}
	
	@DeleteMapping(value = "/deleteFlight/{no}")
	public String delete(@PathVariable int no){
		service.removeFlight(no);
		return "Flight Deleted";
		
	}
	
	@PutMapping(value = "/updateFlight", consumes = "application/json")
	public String update(@RequestBody Flight flight) {
		service.updateFlight(flight);
		return "Flight updated";
	}
}
