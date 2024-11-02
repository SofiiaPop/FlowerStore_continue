package ua.edu.ucu.apps.flower.store;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "flowers")
public class Flower extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float sepal_length;
    @Enumerated(EnumType.STRING)
    private FlowerType type;
    private Float price;
    private String name;

    public Flower(String description) {
        super(description);
    }

    public Flower(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double price() {
        return this.price;
    }

    public Flower(Long l, Float d, FlowerType type) {
        this.id = l;
        this.price = d;
        this.type = type;
    }
}
