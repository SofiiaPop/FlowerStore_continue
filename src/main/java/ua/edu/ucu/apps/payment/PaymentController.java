package ua.edu.ucu.apps.Payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@GetMapping("payment")
	public List<Payment> getPayment() {
		// Create instances of different payment strategies
		Payment creditCardPayment = new CreditCardPaymentStrategy();
		Payment paypalPayment = new PayPalPaymentStrategy(); // Assuming you have this class

		// Return a list containing both payment instances
		return List.of(creditCardPayment, paypalPayment);
	}
}