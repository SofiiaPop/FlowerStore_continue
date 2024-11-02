package ua.edu.ucu.apps.flower.store;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Decorator.BasketDecorator;
import ua.edu.ucu.apps.Decorator.PaperDecorator;
import ua.edu.ucu.apps.Decorator.RibbonDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTests {

    @Test
    public void testBasketDecorator() {
        FlowerBucket bucket = new FlowerBucket();
        FlowerBucket basketDecorated = new BasketDecorator(bucket);

        assertEquals("Flower bucket containing 0 flowers., in busket", basketDecorated.getDescription());
        assertEquals(40, basketDecorated.price(), 0.01);
    }

    @Test
    public void testPaperDecorator() {
        FlowerBucket bucket = new FlowerBucket();
        FlowerBucket paperDecorated = new PaperDecorator(bucket);

        assertEquals("Flower bucket containing 0 flowers., wrapped in paper", paperDecorated.getDescription());
        assertEquals(20, paperDecorated.price(), 0.01);
    }

    @Test
    public void testRibbonDecorator() {
        FlowerBucket bucket = new FlowerBucket();
        FlowerBucket ribbonDecorated = new RibbonDecorator(bucket);

        assertEquals("Flower bucket containing 0 flowers., wrapped in ribbon", ribbonDecorated.getDescription());
        assertEquals(10, ribbonDecorated.price(), 0.01);
    }

    @Test
    public void testMultipleDecorators() {
        FlowerBucket bucket = new FlowerBucket();
        FlowerBucket decoratedBucket = new BasketDecorator(new PaperDecorator(bucket));

        assertEquals("Flower bucket containing 0 flowers., wrapped in paper, in busket", decoratedBucket.getDescription());
        assertEquals(60, decoratedBucket.price(), 0.01);
    }
}
