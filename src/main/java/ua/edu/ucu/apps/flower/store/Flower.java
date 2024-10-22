package ua.edu.ucu.apps.flower.store;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Flower extends Item{
    @Id
    private Long id;
    private double sepalLength;
    private FlowerType type;
    private double price;

    public Flower() {
        super("Default Description");
    }

    public Flower(String description, double price) {
        super(description);
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }
}
