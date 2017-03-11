package com.laptak.booking.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BookingWebApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BookingWebApplication.class, args);
		System.out.println("#### BookingWebApplication Started ###");
	
	}

	@Override
	public void run(String... arg0) throws Exception {
		
	}

}
