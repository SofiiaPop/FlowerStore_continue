package ua.edu.ucu.apps.Delivery;

import ua.edu.ucu.apps.flower.store.Order;
import java.util.List;

public enum DeliveryStrategy {
    Post, DHL;

    public void deliver(List<Order> orders) {
        System.out.println("Delivering order:\n");
        for (Order order : orders) {
            System.out.println(order.getDetails());
        }
    }
}

