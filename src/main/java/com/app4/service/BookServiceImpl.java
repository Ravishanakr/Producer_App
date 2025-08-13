package com.app4.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.app4.entitys.Passenger;
import com.app4.entitys.Ticket;

@Component
public class BookServiceImpl implements BookService {

	Map<Long, Ticket> m = new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger passenger) {

		System.out.println(passenger);
		Ticket t = new Ticket();
		Random r = new Random();

		long TicketNum = r.nextLong(10000);

		t.setTicketNumber(TicketNum);
		t.setStatus("confirmed");

		BeanUtils.copyProperties(passenger, t);

		m.put(TicketNum, t);

		System.out.println(t);
		
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		System.out.println(m.values());
		return m.values();
	}

}
