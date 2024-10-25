package ua.edu.ucu.apps.flower.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FlowerController {
	private final FlowerService flowerService;

	@Autowired
	public FlowerController(FlowerService flowerService){
		this.flowerService = flowerService;
	}

    @GetMapping
	public List<Flower> getFlowers(){
		flowerService.addFlower(new Flower((long) 1, 10.0, FlowerType.ROSE, 150.0));
		return flowerService.getFlowers();
	}

	@PostMapping
	public void addFlower(@RequestBody Flower flower) {
		System.out.println("POST request received");
		System.out.println("24554");
		flowerService.addFlower(flower);
	}
}
