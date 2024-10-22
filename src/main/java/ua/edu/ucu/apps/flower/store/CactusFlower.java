package ua.edu.ucu.apps.flower.store;

public class CactusFlower extends Item {
    private double price;
    private String description;

    public CactusFlower(String description, double price) {
        super(description);
        this.price = price;
        this.description = description;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
