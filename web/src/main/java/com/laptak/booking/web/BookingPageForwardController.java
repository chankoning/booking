package com.laptak.booking.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookingPageForwardController {

	@RequestMapping("/")
	public String landing() {
		System.out.println("# arrived Index");

		return "index";
	}

	@RequestMapping("/page/landing")
	public String index() {
		System.out.println("# arrived Index");

		return "index";
	}

}
