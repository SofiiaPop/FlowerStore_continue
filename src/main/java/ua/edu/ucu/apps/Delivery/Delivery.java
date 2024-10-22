package ua.edu.ucu.apps.Delivery;
import ua.edu.ucu.apps.flower.store.Order;
import java.util.List;

public class Delivery {
    public void deliver(List<Order> orders) {
        for (Order order : orders) {
            System.out.println("Delivering: " + order.getItems());
        }
    }

    public void deliver(Order order) {
        System.out.println("Delivering order:\n" + order.getDetails());
    }
}
