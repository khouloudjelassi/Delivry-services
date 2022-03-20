package de.tekzup.db.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import de.tekzup.db.Repository.DeliveryRepository;
import de.tekzup.db.controllers.DileveryController;
import de.tekzup.db.entities.Delivery;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DeliveryServices {

	private DeliveryRepository deliveryRepository;
	
	
	public String livreurRapide() {
		List<Delivery> deliverys = (List<Delivery>) deliveryRepository.findAll();
		Delivery deliveryRapide = deliverys.get(0);
		
		double difference=ChronoUnit.DAYS.between( deliveryRapide.getShoppingdate(),deliveryRapide.getDeliveryDate());
		
//		long diff = deliveryRapide.getDeliveryDate().getTime() - deliveryRapide.getShoppingDate().getTime();
		
				for (Delivery delivery : deliverys) {

			if(ChronoUnit.DAYS.between( delivery.getShoppingdate(),delivery.getDeliveryDate()) < difference )
			{
				deliveryRapide = delivery;
			}

		}
		return deliveryRapide.getDeliveryman();
	}
	
	
	
	
	
	
	public String livreurLent() {
		List<Delivery> deliverys = (List<Delivery>) deliveryRepository.findAll();
		Delivery deliveryRapide = deliverys.get(0);
		
		double difference=ChronoUnit.DAYS.between( deliveryRapide.getShoppingdate(),deliveryRapide.getDeliveryDate());
		
//		long diff = deliveryRapide.getDeliveryDate().getTime() - deliveryRapide.getShoppingDate().getTime();
		
				for (Delivery delivery : deliverys) {

			if(ChronoUnit.DAYS.between( delivery.getShoppingdate(),delivery.getDeliveryDate()) > difference )
			{
				deliveryRapide = delivery;
			}

		}
		return deliveryRapide.getDeliveryman();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Map<List<String>,List<Long>> LivraisonRapide() {
		List<Delivery> deliveries= deliveryRepository.findAll();
	//	String name=deliveries.stream().map(d->d.getDeliveryDate()-d.getShoppingdate()).collect(Collectors.toList());
		
		List<String> names=deliveries.stream().map(d->d.getDeliveryman()).collect(Collectors.toList());
		
	
		List<Long> duration=deliveries.stream().map(d->
													ChronoUnit.DAYS.between( d.getShoppingdate(),d.getDeliveryDate())
															)
													.collect(Collectors.toList());

		
		Map<List<String>,List<Long>> map = new HashMap<>();
		
		   map.put(names,duration);
		   
		   
		   for (Map.Entry m : map.entrySet()) {
	            System.out.println("ID: "+m.getKey()+", Nom: "+m.getValue());
	        }
		

		
		return map;
		
	}


	
}
