package com.app4.service;

import java.util.Collection;
import java.util.List;

import com.app4.entitys.Passenger;
import com.app4.entitys.Ticket;

public interface BookService {

	public Ticket bookTicket(Passenger passenger);

	public Collection<Ticket> getAllTickets();

}
