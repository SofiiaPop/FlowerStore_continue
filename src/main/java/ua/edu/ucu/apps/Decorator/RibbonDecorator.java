package ua.edu.ucu.apps.Decorator;

import ua.edu.ucu.apps.flower.store.FlowerBucket;
import ua.edu.ucu.apps.flower.store.FlowerBucketDecorator;
import ua.edu.ucu.apps.flower.store.Item;

public class RibbonDecorator extends FlowerBucketDecorator {
    private Item item;

    public RibbonDecorator(FlowerBucket flowerBucket) {
        super(flowerBucket);
        // this.item = item;
    }

    @Override
    public String getDescription() {
        return flowerBucket.getDescription() + ", wrapped in ribbon";
    }

    @Override
    public double price() {
        return item.price() + 40;
    }
}
