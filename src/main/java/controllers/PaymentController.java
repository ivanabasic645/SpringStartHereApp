package controllers;

import model.*;
import java.util.logging.Logger;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
	private static Logger logger = Logger.getLogger(PaymentController.class.getName());

	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails) {
		logger.info("Received payment " + paymentDetails.getAmount());
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
	}
}
