package com.example.SampleWeb;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sample {
	@RequestMapping("/sample")
	public String start() {
		return "sample.html";
	}
}
