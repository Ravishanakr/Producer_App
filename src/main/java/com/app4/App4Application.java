package com.app4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;

import com.app4.controller.BookTickets;
import com.app4.entitys.Passenger;
import com.app4.entitys.Ticket;

@SpringBootApplication
public class App4Application {

	public static void main(String[] args) {
	 SpringApplication.run(App4Application.class, args);

		/*
		 * BookTickets bean = run.getBean(BookTickets.class);
		 * 
		 * Passenger p = new Passenger(); p.setFrom("gun");
		 * p.setPassengerDob("09-29000"); p.setPassengerEmail("Ravi@gmail.com");
		 * p.setTo("Hyd"); p.setTrinNumber(12311l); p.setPassengerName("Ravi");
		 * 
		 * Ticket bookTicket = bean.bookTicket(p);
		 * 
		 * System.out.println(bookTicket);
		 */
	}

}
