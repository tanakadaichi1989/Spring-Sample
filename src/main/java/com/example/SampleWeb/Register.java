package com.example.SampleWeb;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {
	@RequestMapping("/register")
	public String start() {
		return "register.html";
	}
}
