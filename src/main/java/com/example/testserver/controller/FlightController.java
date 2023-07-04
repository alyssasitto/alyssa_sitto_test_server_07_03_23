package com.example.testserver.controller;

import com.example.testserver.dto.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.testserver.service.FlightService;

import java.util.List;

@RestController
@RequestMapping("/flight")
@CrossOrigin(origins = "*")
public class FlightController {
    @Autowired
    private FlightService service;

    @PostMapping("/add")
    @PutMapping("/add")
    public Flight addFlight(@RequestBody Flight flight) {
        return service.addFlight(flight);
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return service.getAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable int id) {
        return service.getFlightById(id);
    }

    @PutMapping("/update")
    public Flight updateFlight(@RequestBody Flight flight) {
        return service.updateFlight(flight);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFlightById(@PathVariable int id) {
        return service.deleteFlight(id);
    }
}
