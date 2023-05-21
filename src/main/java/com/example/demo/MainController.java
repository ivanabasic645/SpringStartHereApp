package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

	@RequestMapping("/home/{color}")
	public String home( @PathVariable String color, Model page) {
		page.addAttribute("username", "Ivana");
		page.addAttribute("color", color);
		return "home.html";
	}
	
}
