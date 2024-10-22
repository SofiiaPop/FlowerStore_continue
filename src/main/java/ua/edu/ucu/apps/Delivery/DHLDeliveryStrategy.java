package ua.edu.ucu.apps.Delivery;
import java.util.List;

import ua.edu.ucu.apps.flower.store.Item;
import ua.edu.ucu.apps.flower.store.Order;

public class DHLDeliveryStrategy extends Delivery{
    private double price;
    private List<Order> orders;

    public DHLDeliveryStrategy(double price, List<Order> orders) {
        this.price = price;
        this.orders = orders;
    }
   
    @Override
    public void deliver(List<Order> orders) {
        System.out.println("Delivering order via DHL: /n");
        super.deliver(orders);
    }

    public double price() {
        double total = price;
        for (Order order : orders) {
            for (Item item : order.getItems()) {
                total += item.price();
            }
        }
        return total;
    }
}

