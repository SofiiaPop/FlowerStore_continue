package ua.edu.ucu.apps.Delivery;

import java.util.List;
import ua.edu.ucu.apps.flower.store.Order;

public class DeliveryController {
    private Delivery deliveryStrategy;

    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void deliverOrders(List<Order> orders) {
        deliveryStrategy.deliver(orders);
    }

    public void deliverOrderDetails(Order order) {
        deliveryStrategy.deliver(order);
    }

    public String getDeliveryStrategyInfo() {
        return "Current delivery strategy: " + deliveryStrategy.getClass().getSimpleName();
    }
}
