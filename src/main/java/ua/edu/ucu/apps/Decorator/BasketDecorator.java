package ua.edu.ucu.apps.Decorator;

import ua.edu.ucu.apps.flower.store.FlowerBucket;
import ua.edu.ucu.apps.flower.store.FlowerBucketDecorator;
import ua.edu.ucu.apps.flower.store.Item;

public class BasketDecorator extends FlowerBucketDecorator {
    private Item item;

    public BasketDecorator(FlowerBucket flowerBucket) {
        super(flowerBucket);
        // this.item = item;
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
