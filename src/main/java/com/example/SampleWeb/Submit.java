package com.example.SampleWeb;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Submit {

	@RequestMapping("/submit")
		public ModelAndView submit(@ModelAttribute SubmitBean sb, ModelAndView m) {
			m.addObject("sb", sb);
			m.setViewName("confirm.html");
			return m;
		}
}
