package de.tekzup.db.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.entities.OrderEntity;

public interface OrderEntityRepository extends JpaRepository<OrderEntity, Integer> {

}
