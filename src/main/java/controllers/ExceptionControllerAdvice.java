package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import exceptions.NotEnoughMoneyException;
import model.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	@ExceptionHandler(NotEnoughMoneyException.class)
	public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setMessage("Not enough money to make the payment.");
		return ResponseEntity.badRequest().body(errorDetails);
	}
	
}
