package ua.edu.ucu.apps.flower.store;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FlowerController {
	private static final Logger logger = LoggerFactory.getLogger(FlowerController.class);
	private final FlowerService flowerService;

	@Autowired
	public FlowerController(FlowerService flowerService){
		this.flowerService = flowerService;
		logger.info("FlowerController initialized");
	}

    @GetMapping
	public List<Flower> getFlowers(){
		return flowerService.getFlowers();
	}

	@PostMapping
	public void addFlower(@RequestBody Flower flower) {
		logger.info("POST request received for flower: {}", flower.getName());
		flowerService.addFlower(flower);
	}
}
