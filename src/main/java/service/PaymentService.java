package service;
import org.springframework.stereotype.Service;

import exceptions.NotEnoughMoneyException;
import model.PaymentDetails;

@Service
public class PaymentService {
	
	public PaymentDetails processPayment() throws NotEnoughMoneyException {
		throw new NotEnoughMoneyException();
	}
}
