package ua.edu.ucu.apps.flower.store;

import java.util.List;
// import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @Transactional
    public List<Flower> getFlowers(){
        System.out.println("Retrieved flowers");
        return flowerRepository.findAll();
    }

    @Transactional
    public void addFlower(Flower flower) {
        System.out.println("Saving");
        flowerRepository.save(flower);
        System.out.println("Flower saved successfully");
    }
}

