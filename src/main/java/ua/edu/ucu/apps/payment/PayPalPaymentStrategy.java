package ua.edu.ucu.apps.Payment;

import lombok.Getter;
import ua.edu.ucu.apps.flower.store.Order;

@Getter
public class PayPalPaymentStrategy implements Payment {
    private String description;
    @Override
    public void pay(Order order) {
        description = "Paid with PayPal:" + order.calculateTotalPrice();
        System.out.print(description);
    }
}