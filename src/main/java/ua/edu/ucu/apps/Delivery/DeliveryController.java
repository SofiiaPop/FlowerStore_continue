package ua.edu.ucu.apps.Delivery;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {
	@GetMapping("delivery")
    public List<Delivery> getDelivery() {
        List<Delivery> deliveryStrategies = new ArrayList<>();
        deliveryStrategies.add(new PostDeliveryStrategy());
        deliveryStrategies.add(new DHLDeliveryStrategy());
        return deliveryStrategies;
    }
}
