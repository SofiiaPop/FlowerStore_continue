package ua.edu.ucu.apps.Delivery;

import java.util.List;

import ua.edu.ucu.apps.flower.store.Order;

public class Delivery {
    public void deliver(List<Order> orders) {
        for (Order order : orders) {
            System.out.println("Delivering: " + order.getDetails());
        }
    }

    public void deliver(String orderDetails) {
        System.out.println("Delivering order:\n" + orderDetails);
    }
}
