package ua.edu.ucu.apps.flower.store;

import java.util.List;
import java.util.ArrayList;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private List<Flower> flowerList = new ArrayList<>();

    public List<Flower> getFlowers() {
        System.out.println("Retrieving flowers...");
        return flowerList;
    }

    public void addFlower(Flower flower) {
        System.out.println("Adding flower: " + flower);
        flowerList.add(flower);
        System.out.println("Flower added successfully ");
    }
}

// @Service
// public class FlowerService {
//     private FlowerRepository flowerRepository;
//     private List<Flower> flowers;

//     @Autowired
//     public FlowerService(FlowerRepository flowerRepository) {
//         this.flowerRepository = flowerRepository;
//     }

//     public List<Flower> getFlowers(){
//         System.out.println("Retrieved flowers");
//         return flowerRepository.findAll();
//     }

//     public void addFlower(Flower flower) {
//         System.out.println("Adding flower: " + flower.getDescription());
//         flowerRepository.save(flower);
//         System.out.println("Flower saved successfully");
//     }
// }

