package ua.edu.ucu.apps.Decorator;

import ua.edu.ucu.apps.flower.store.FlowerBucket;

public abstract class AbstractDecorator extends FlowerBucket {
    protected FlowerBucket flowerBucket;

    public AbstractDecorator(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }

    @Override
    public String getDescription() {
        return flowerBucket.getDescription();
    }

    @Override
    public double price() {
        return flowerBucket.price();
    }
}

