package ua.edu.ucu.apps.Payment;

import lombok.Getter;
import ua.edu.ucu.apps.flower.store.Order;

@Getter
public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(Order order) {
        System.out.printf("Paid with PayPal:", order.calculateTotalPrice());
    }
}