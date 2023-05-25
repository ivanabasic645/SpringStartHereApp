package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import processor.LoginProcessor;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginGet() {
		return "login.html";
	}
	
	@PostMapping("/login")
	public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
		
		LoginProcessor loginProcessor = new LoginProcessor();
		loginProcessor.setUsername(username);
		loginProcessor.setPassword(password);
		boolean loggedIn = loginProcessor.login();
		
		if(loggedIn) {
			return "redirect:/home";
		} else {
			model.addAttribute("message", "Login failed.");
		}
		return "login.html";
		
	}
	
	
}
