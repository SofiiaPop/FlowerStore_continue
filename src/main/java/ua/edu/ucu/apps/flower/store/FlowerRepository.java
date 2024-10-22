package ua.edu.ucu.apps.flower.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long>{
    
}
