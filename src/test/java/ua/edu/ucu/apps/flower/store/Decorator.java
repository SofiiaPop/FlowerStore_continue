package ua.edu.ucu.apps.flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Decorator.BasketDecorator;
import ua.edu.ucu.apps.Decorator.PaperDecorator;
import ua.edu.ucu.apps.Decorator.RibbonDecorator;
import static org.junit.jupiter.api.Assertions.*;

class Decorator {
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        flowerBucket = new FlowerBucket();
        Flower rose = new Flower(1L, 5.0f, FlowerType.ROSE, 50.0f, "Rose");
        Flower tulip = new Flower(2L, 4.5f, FlowerType.TULIP, 30.0f, "Tulip");
        flowerBucket.addFlowers(rose);
        flowerBucket.addFlowers(tulip);
    }

    @Test
    void testFlowerBucket() {
        assertEquals("Flower bucket containing 2 flowers.", flowerBucket.getDescription());
        assertEquals(80.0, flowerBucket.price(), 0.01);
    }

    @Test
    void testBasketDecorator() {
        BasketDecorator basketDecorated = new BasketDecorator(flowerBucket);
        assertEquals("Flower bucket containing 2 flowers., in busket", basketDecorated.getDescription());
        assertEquals(120.0, basketDecorated.price(), 0.01);
    }

    @Test
    void testPaperDecorator() {
        PaperDecorator paperDecorated = new PaperDecorator(flowerBucket);
        assertEquals("Flower bucket containing 2 flowers., wrapped in paper", paperDecorated.getDescription());
        assertEquals(100.0, paperDecorated.price(), 0.01);
    }

    @Test
    void testRibbonDecorator() {
        RibbonDecorator ribbonDecorated = new RibbonDecorator(flowerBucket);
        assertEquals("Flower bucket containing 2 flowers., wrapped in ribbon", ribbonDecorated.getDescription());
        assertEquals(90.0, ribbonDecorated.price(), 0.01);
    }

    @Test
    void testMultipleDecorators() {
        BasketDecorator basketDecorated = new BasketDecorator(flowerBucket);
        PaperDecorator paperDecorated = new PaperDecorator(basketDecorated);
        RibbonDecorator ribbonDecorated = new RibbonDecorator(paperDecorated);
        assertEquals("Flower bucket containing 2 flowers., in busket, wrapped in paper, wrapped in ribbon",
                ribbonDecorated.getDescription());
        assertEquals(150.0, ribbonDecorated.price(), 0.01);
    }
}
