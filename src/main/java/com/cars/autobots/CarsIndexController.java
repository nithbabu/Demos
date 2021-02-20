package com.cars.autobots;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsIndexController {

	@GetMapping("/home")
	public String home(Model model) {
		System.out.println("Webapp initialised");
		return "home";
	}
	
}
