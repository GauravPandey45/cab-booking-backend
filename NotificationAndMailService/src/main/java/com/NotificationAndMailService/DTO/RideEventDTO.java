package com.NotificationAndMailService.DTO;


import com.NotificationAndMailService.RideStatus;

import lombok.Data;

@Data
public class RideEventDTO {
	
	private String driverName;
	private String customerMail;
	private String customerPhone;
	private String rideDetails;
	private int otp;
	private String source;
	private String destination;
	private double fare;
	private RideStatus event;

}
