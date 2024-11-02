package ua.edu.ucu.apps.Decorator;

import ua.edu.ucu.apps.flower.store.FlowerBucket;
import ua.edu.ucu.apps.flower.store.Item;

public class BasketDecorator extends AbstractDecorator {
    private Item item;

    public BasketDecorator(FlowerBucket flowerBucket) {
        super(flowerBucket);
        this.item = flowerBucket; 
    }

    @Override
    public String getDescription() {
        return flowerBucket.getDescription() + ", in busket";
    }

    @Override
    public double price() {
        return item.price() + 40;
    }
}
