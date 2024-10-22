package ua.edu.ucu.apps.payment;

import java.util.List;

import ua.edu.ucu.apps.flower.store.Item;

public interface Payment {
    void pay(List<Item> items);
    String getDescription();
}