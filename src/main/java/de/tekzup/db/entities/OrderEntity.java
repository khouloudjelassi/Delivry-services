package de.tekzup.db.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class OrderEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate createDate;
	private OrderStatus orderstatus;
	
	@ManyToOne
	private Customer customer;

	@OneToMany(mappedBy = "order")
	private List<OrderDetail> orderdetail =new ArrayList<>();
	
	@ManyToOne
	private Delivery delivery;
	
}
