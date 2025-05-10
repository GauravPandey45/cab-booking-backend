package com.CabApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CabApp.Entities.Rides;
import com.CabApp.Service.RidesService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/rides")
public class RidesController {

	@Autowired
	RidesService ridesService;
	
	@PostMapping("/book")
	public Rides rideBooked(@RequestBody Rides rides) throws Exception {
		return ridesService.bookRide(rides);
	}
	
	@PutMapping("/complete")
	public String rideCompleted() throws Exception {
		return ridesService.completeRide();
	}
	
	@PutMapping("/cancel")
	public String rideCancelled() throws Exception {
		return ridesService.cancelRide();
	}
}
