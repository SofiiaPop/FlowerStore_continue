package ua.edu.ucu.apps.Delivery;

import java.util.List;
import ua.edu.ucu.apps.flower.store.Item;
import ua.edu.ucu.apps.flower.store.Order;

public class PostDeliveryStrategy extends Delivery {
    private double price;
    private Order order;

    public PostDeliveryStrategy() {
        super(DeliveryStrategy.Post);
        this.price = 0;
        this.order = null;
    }

    public PostDeliveryStrategy(double price, Order order) {
        super(DeliveryStrategy.Post);
        this.price = price;
        this.order = order;
    }
   
    @Override
    public void deliver(List<Order> orders) {
        System.out.println("Delivering order via Post: /n");
        super.deliver(orders);
    }

    public double price() {
        double total = price;
        for (Item item : order.getItems()) {
            total += item.price();
        }
        return total;
    }
}

