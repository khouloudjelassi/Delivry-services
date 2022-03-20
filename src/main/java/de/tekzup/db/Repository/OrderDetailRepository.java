package de.tekzup.db.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.entities.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Integer> {

}
