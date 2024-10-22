package ua.edu.ucu.apps.Delivery;

import ua.edu.ucu.apps.flower.store.Item;
import ua.edu.ucu.apps.flower.store.Order;
import java.util.List;

public class DHLDeliveryStrategy extends Delivery{
    private double price;
    private Order order;

    public DHLDeliveryStrategy(double price, Order order) {
        this.price = price;
        this.order = order;
    }
   
    @Override
    public void deliver(List<Order> orders) {
        System.out.println("Delivering order via DHL: /n");
        super.deliver(order);
    }

    public double price() {
        double total = price;
        for (Item item : order.getItems()) {
            total += item.price();
        }
        return total;
    }
}

