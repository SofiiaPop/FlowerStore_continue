package ua.edu.ucu.apps.Decorator;

import ua.edu.ucu.apps.flower.store.FlowerBucket;
import ua.edu.ucu.apps.flower.store.Item;

public class RibbonDecorator extends AbstractDecorator {
    private Item item;

    public RibbonDecorator(FlowerBucket flowerBucket) {
        super(flowerBucket);
        this.item = flowerBucket; 
    }

    @Override
    public String getDescription() {
        return flowerBucket.getDescription() + ", wrapped in ribbon";
    }

    @Override
    public double price() {
        return item.price() + 10;
    }
}
