package de.tekzup.db.services;

import org.springframework.stereotype.Service;

import de.tekzup.db.Repository.CustomerRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServices {

	private CustomerRepository customerRepository;
	
	
}
