package ua.edu.ucu.apps.flower.store;

public abstract class Item {
    private String description;

    public Item() {
        this.description = "Default Description";
    }

    public Item(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double price();
}