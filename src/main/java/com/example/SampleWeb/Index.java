package com.example.SampleWeb;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
	@RequestMapping("/")
	public String start() {
		return "Index.html";
	}
}
