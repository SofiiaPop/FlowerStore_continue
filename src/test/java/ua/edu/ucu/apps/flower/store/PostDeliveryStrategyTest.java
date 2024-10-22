package ua.edu.ucu.apps.flower.store;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Delivery.PostDeliveryStrategy;

import java.util.LinkedList;

public class PostDeliveryStrategyTest {
    private PostDeliveryStrategy delivery;
    private Order order;

    @BeforeEach
    public void setUp() {
        LinkedList<Item> items = new LinkedList<>();
        Item item1 = new CactusFlower("white romashka", 50);
        items.add(item1);
        items.add(item1);
        items.add(item1);

        order = new Order(items);
        delivery = new PostDeliveryStrategy(50.0, order);
    }

    @Test
    public void testDeliver() {
        delivery.deliver(order);
    }

    @Test
    public void testPrice() {
        double expectedPrice = 200.0;
        assertEquals(expectedPrice, delivery.price());
    }
}

