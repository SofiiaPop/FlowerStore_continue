package ua.edu.ucu.apps.Payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("payment")
	public List<CreditCardPaymentStrategy> getPayment(){
		return List.of(new CreditCardPaymentStrategy());
	}
}