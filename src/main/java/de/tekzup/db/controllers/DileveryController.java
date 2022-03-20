package de.tekzup.db.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekzup.db.services.DeliveryServices;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor

public class DileveryController {

	private  DeliveryServices deliveryServices;
	
	
	@GetMapping("/rapidlivreur")
public 	String livraisonRapide() {
		return deliveryServices.livreurRapide();
	
		
	}
	
	
	@GetMapping("/livreurlent")
	public String livreurLent() {
		return deliveryServices.livreurLent();
	}
	
	
		
	
}
