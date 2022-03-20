package de.tekzup.db.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import de.tekzup.db.Repository.CustomerRepository;
import de.tekzup.db.Repository.OrderEntityRepository;
import de.tekzup.db.entities.Customer;
import de.tekzup.db.entities.OrderEntity;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderServices {

	private OrderEntityRepository orderEntityRepository;
	
	private CustomerRepository customerRepository;
	
	
	public double calculateTotal(OrderEntity orderEntity) {
		double total =orderEntity.getOrderdetail().stream()
				.mapToDouble(i->i.getItem().getPrice()*i.getQty()+i.getTax())
				.sum();
			
		return total;
	}
	
	public double calculateWeight(OrderEntity orderEntity) {
		double weight=orderEntity.getOrderdetail().stream()
				.mapToDouble(i->i.getItem().getWeight()*i.getQty())
				.sum();
			
		return weight;
	}
	
	
	
	public List<String> topClientOrdre(){
		
		List<String> list=new ArrayList<>();
		
		
		List<Customer> customors=customerRepository.findAll();
		
		
	
	for(int i=0;i<5;i++) {
		Customer customor=customors.stream()
				.max(Comparator.comparing(c-> c.getOrder().size())).orElse(new Customer());
		list.add(customor.getName());
		 customors.remove(customor);
	}
		
		return list;
		
	}
	
	public List<String> topClientDepenses(){
		
		
		return null;
		
	}
	
}
