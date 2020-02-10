package com.example.cg.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.cg.entity.Flight;

public interface FlightRepo extends CrudRepository<Flight, Integer> {

}
