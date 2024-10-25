package ua.edu.ucu.apps.flower.store;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.Delivery.Delivery;
import ua.edu.ucu.apps.Payment.Payment;

public class Order {
    @Getter
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void SetPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void SetDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public Order(LinkedList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }

    public String getDetails() {
        StringBuilder details = new StringBuilder("Order details:\n");
        for (Item item : items) {
            details.append(item.getDescription()).append(" - Price: $").append(item.price()).append("\n");
        }
        return details.toString();
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }

    public void processOrder() {
        double totalPrice = calculateTotalPrice();
        System.out.println("Processing payment of $" + totalPrice);
        payment.pay(this);
        List<Order> orders = new ArrayList<>();
        orders.add(this);
        delivery.deliver(orders);
        System.out.println("Order processed successfully!");
    }
}

