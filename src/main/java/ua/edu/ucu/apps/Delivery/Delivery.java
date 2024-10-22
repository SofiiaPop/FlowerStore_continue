package ua.edu.ucu.apps.Delivery;

import ua.edu.ucu.apps.flower.store.Item;
import ua.edu.ucu.apps.flower.store.Order;

public class Delivery {
    public void deliver(Order order) {
        for (Item item : order.getItems()) {
            System.out.println("Delivering: " + item.getDescription());
        }
    }

    public void deliver(String orderDetails) {
        System.out.println("Delivering order:\n" + orderDetails);
    }
}
