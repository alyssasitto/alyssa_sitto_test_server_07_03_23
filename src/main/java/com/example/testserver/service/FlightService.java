package com.example.testserver.service;

import com.example.testserver.dto.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testserver.repo.FlightRepository;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    public FlightRepository repo;

    public Flight addFlight(Flight flight) {
       return repo.save(flight);
    }

    public List<Flight> getAllFlights() {
        return repo.findAll();
    }

    public Flight getFlightById(int id) {
        return repo.findById(id).orElse(null);
    }

    public String deleteFlight(int id) {
        repo.deleteById(id);
        return "Flight had been deleted";
    }

    public Flight updateFlight(Flight flight) {
        Flight foundFlight = repo.findById(flight.getFlightNumber()).orElse(null);
        foundFlight.setFlightName(flight.getFlightName());
        foundFlight.setOrigin(flight.getOrigin());
        foundFlight.setDestination(flight.getDestination());
        foundFlight.setSeatsAvailable(flight.getSeatsAvailable());
        foundFlight.setFare(flight.getFare());
        return repo.save(foundFlight);
    }


}
