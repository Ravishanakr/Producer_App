package com.app4.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app4.entitys.Passenger;
import com.app4.entitys.Ticket;
import com.app4.service.BookService;

@RestController
public class BookTickets {

	@Autowired
	private BookService serv;

	@PostMapping(value = "/book", consumes = "application/json")
	public Ticket getAllTickets(@RequestBody  Passenger p) {

		Ticket bookTicket = serv.bookTicket(p);
	    System.out.println("Hi all How are you ");

		return bookTicket;

	}

	@GetMapping(value = "/getAllTickets")
	public Collection<Ticket> getAllTickets() {

		Collection<Ticket> allTickets = serv.getAllTickets();
		return allTickets;

	}

}
