package controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import model.Country;

@RestController
public class CountryController {

	@GetMapping("/france")
	public ResponseEntity<Country> france() {
		Country c = Country.of("france", 67);
		return ResponseEntity
			   .status(HttpStatus.ACCEPTED)
			   .header("continent", "Europe")
			   .header("capital", "Paris")
			   .header("favourite_food", "cheese and wine")
			   .body(c);
	}
	
	 @GetMapping("/all")
	 public List<Country> countries() {
	 Country c1 = Country.of("France", 67);
	 Country c2 = Country.of("Spain", 47);
	 return List.of(c1,c2);
	 }
	
}
