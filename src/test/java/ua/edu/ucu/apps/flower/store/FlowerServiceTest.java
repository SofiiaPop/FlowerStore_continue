package ua.edu.ucu.apps.flower.store;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class FlowerServiceTest {

    @InjectMocks
    private FlowerService flowerService;

    @Mock
    private FlowerRepository flowerRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetFlowers() {
        // Flower flower1 = new Flower((long) 1, 10.0, FlowerType.ROSE);
        // Flower flower2 = new Flower((long) 2, 15.0, FlowerType.TULIP);
        // List<Flower> expectedFlowers = Arrays.asList(flower1, flower2);
        
        // when(flowerRepository.findAll()).thenReturn(expectedFlowers);
        // List<Flower> actualFlowers = flowerService.getFlowers();
        // assertEquals(expectedFlowers, actualFlowers);
        // verify(flowerRepository, times(1)).findAll();
    }
}

