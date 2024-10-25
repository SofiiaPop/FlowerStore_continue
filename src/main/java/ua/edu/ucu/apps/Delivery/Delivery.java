package ua.edu.ucu.apps.Delivery;
import ua.edu.ucu.apps.flower.store.Order;
import java.util.List;

public class Delivery{
    private DeliveryStrategy deliveryStrategy;

    public Delivery(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void deliver(List<Order> orders) {
        for (Order order : orders) {
            System.out.println("Delivering: " + order.getItems());
        }
    }

    public void deliverOrders(List<Order> orders) {
        deliveryStrategy.deliver(orders);
    }

    public void deliverOrderDetails(List<Order> orders) {
        deliveryStrategy.deliver(orders);
    }

    public String getDeliveryStrategyInfo() {
        return "Current delivery strategy: " + deliveryStrategy;
    }
}
