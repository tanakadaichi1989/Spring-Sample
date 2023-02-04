package com.example.SampleWeb;

import org.springframework.web.bind.annotation.RequestMapping;

public class Confirm {
	@RequestMapping("/confirm")
	public String start() {
		return "confirm.html";
	}
}
