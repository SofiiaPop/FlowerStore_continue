package ua.edu.ucu.apps.payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("payment")
	public List<CreditcardPaymentStrategy> getPayment(){
		return List.of(new CreditcardPaymentStrategy());
	}
}