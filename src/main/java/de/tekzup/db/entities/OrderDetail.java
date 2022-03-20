package de.tekzup.db.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class OrderDetail {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float tax;
	private int qty;

	@ManyToOne
	private OrderEntity order;
	
	@ManyToOne
	private Item item;
}
