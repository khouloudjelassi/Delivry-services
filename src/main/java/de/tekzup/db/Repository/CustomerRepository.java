package de.tekzup.db.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
