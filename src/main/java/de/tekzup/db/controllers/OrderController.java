package de.tekzup.db.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekzup.db.Repository.OrderEntityRepository;
import de.tekzup.db.entities.OrderEntity;
import de.tekzup.db.services.OrderServices;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor

public class OrderController {

	private OrderServices oderServices;
	private OrderEntityRepository orderEntityRepository;
	
	@GetMapping("/calculetotale/{id}")
	public double calculateTotale(@PathVariable int id) {
		OrderEntity orderEntity= orderEntityRepository.findById(id).get();
		return oderServices.calculateTotal(orderEntity);
		
	}
	@GetMapping("/calculateweight/{id}")
	public double calculateWeight(@PathVariable int id ) {	
		OrderEntity orderEntity= orderEntityRepository.findById(id).get();
		return oderServices.calculateWeight(orderEntity);
	}
	
	
	@GetMapping("/bestOrderedClients")
	public List<String> topClientOrdre(){
		return oderServices.topClientOrdre();
	}
}
