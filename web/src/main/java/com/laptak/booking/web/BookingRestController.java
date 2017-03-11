package com.laptak.booking.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.laptak.booking.vo.ItemVO;

@RestController
@RequestMapping(value = "/rest")
public class BookingRestController {

	@RequestMapping("/echo")
	String home() {
		return "Hello World!";
	}

	@RequestMapping(value = "/booking/submit", method = RequestMethod.POST, consumes = "application/json")
	void submit(@RequestBody ItemVO[] itemVOs) {
		System.out.println("received booking submission");

		for (ItemVO item : itemVOs) {
			System.out.println(item.getName() + " " + item.getQty());
		}

	}

}
