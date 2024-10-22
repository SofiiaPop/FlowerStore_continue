package ua.edu.ucu.apps.Payment;
import ua.edu.ucu.apps.flower.store.Order;

public interface Payment {
    void pay(Order order);
}