package ua.edu.ucu.apps.flower.store;

public abstract class FlowerBucketDecorator extends FlowerBucket {
    protected FlowerBucket flowerBucket;

    public FlowerBucketDecorator(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }

    @Override
    public abstract String getDescription();
}
