package com.CabApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CabApp.Entities.Drivers;
import com.CabApp.Service.DriversService;

@RestController
@RequestMapping("/drivers")
public class DriverController {
	
	@Autowired
	DriversService driversService;
	
	@PostMapping("/register")
	public Drivers addDrivers(@RequestBody Drivers drivers) {
		return driversService.driverDetails(drivers);
		
	}
	

}
