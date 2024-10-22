package ua.edu.ucu.apps.flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Payment.CreditCardPaymentStrategy;
import java.util.LinkedList;
public class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy payment;
    private Order order;

    @BeforeEach
    public void setUp() {
        LinkedList<Item> items = new LinkedList<>();
        Item item1 = new RomashkaFlower("white romashka", 50);
        items.add(item1);
        items.add(item1);
        items.add(item1);

        order = new Order(items);
        payment = new CreditCardPaymentStrategy();
    }

    @Test
    public void testPay() {
        payment.pay(order);
    }
}
