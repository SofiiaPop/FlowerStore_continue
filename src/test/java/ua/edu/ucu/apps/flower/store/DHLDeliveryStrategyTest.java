package ua.edu.ucu.apps.flower.store;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Delivery.DHLDeliveryStrategy;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy delivery;
    private Order order;

    @BeforeEach
    public void setUp() {
        LinkedList<Item> items = new LinkedList<>();
        Item item1 = new RomashkaFlower("white romashka", 50);
        items.add(item1);
        items.add(item1);
        items.add(item1);

        order = new Order(items);
        delivery = new DHLDeliveryStrategy(100.0, order);
    }

    @Test
    public void testDeliver() {
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        delivery.deliver(orders);
    }

    @Test
    public void testPrice() {
        double expectedPrice = 250.0;
        assertEquals(expectedPrice, delivery.price());
    }
}
