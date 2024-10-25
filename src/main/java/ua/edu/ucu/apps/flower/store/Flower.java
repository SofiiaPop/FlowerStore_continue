package ua.edu.ucu.apps.flower.store;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
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

    public Flower(String description) {
        super(description);
    }

    @Override
    public double price() {
        return price;
    }

    public Flower(long l, double d, FlowerType rose) {
        this.id = l;
        this.price = d;
        this.type = rose;
    }
}
