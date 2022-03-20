package de.tekzup.db.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.entities.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer>{

}
