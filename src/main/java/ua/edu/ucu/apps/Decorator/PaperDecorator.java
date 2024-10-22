package ua.edu.ucu.apps.Decorator;

import ua.edu.ucu.apps.flower.store.FlowerBucket;
import ua.edu.ucu.apps.flower.store.FlowerBucketDecorator;
import ua.edu.ucu.apps.flower.store.Item;

public class PaperDecorator extends FlowerBucketDecorator {
    private Item item;
    public PaperDecorator(FlowerBucket flowerBucket) {
        super(flowerBucket);
        // this.item = item;
    }

    @Override
    public String getDescription() {
        return flowerBucket.getDescription() + ", wrapped in paper";
    }

    @Override
    public double price() {
        return item.price() + 13;
    }
}
