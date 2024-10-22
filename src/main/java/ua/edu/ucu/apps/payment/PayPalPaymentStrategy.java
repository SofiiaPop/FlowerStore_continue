package ua.edu.ucu.apps.payment;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.flower.store.Item;

@Getter
public class PayPalPaymentStrategy implements Payment {
    private String description;

    public void CreditCardDescription(){
        description = "Paid with PayPal";
    }
    @Override
    public void pay(List<Item> items) {
        double price = 0;
        for (Item item: items) {
            price += item.price();
        }
        System.out.printf("Paid with PayPal:", price);
    }
}