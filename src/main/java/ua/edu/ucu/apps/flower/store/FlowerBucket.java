package ua.edu.ucu.apps.flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<Flower> flowers;

    public String getDescription() {
        return "Flower bucket containing " + flowers.size() + " flowers.";
    }

    public FlowerBucket() {
        super("Flower bucket");
        this.flowers = new ArrayList<>();
    }

    public void addFlowers(Flower flower) {
        this.flowers.add(flower);
    }

    @Override
    public double price() {
        double total = 0;
        for (Flower flower : flowers) {
            total += flower.price();
        }
        return total; 
        }
    
    public String searchFlower(Flower flower) {
        for (Flower flow : flowers) {
            if (flow == flower) {
                return "The flower is in bucket.";
            }
        }
        return "The flower is not in bucket.";
    }
}
