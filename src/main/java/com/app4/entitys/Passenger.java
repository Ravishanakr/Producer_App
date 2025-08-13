package com.app4.entitys;

public class Passenger {

	private String passengerName;
	private String passengerEmail;
	private String passengerDob;
	private String from;
	private String to;
	private Long trinNumber;

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public String getPassengerDob() {
		return passengerDob;
	}

	public void setPassengerDob(String passengerDob) {
		this.passengerDob = passengerDob;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Long getTrinNumber() {
		return trinNumber;
	}

	public void setTrinNumber(Long trinNumber) {
		this.trinNumber = trinNumber;
	}

}
