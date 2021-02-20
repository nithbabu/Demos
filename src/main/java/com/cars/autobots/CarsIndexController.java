package com.cars.autobots;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarsIndexController {

	@RequestMapping("home")
	@ResponseBody
	public String home() {
		System.out.println("Webapp initialised");
		return "home.jsp";
	}
	
}
