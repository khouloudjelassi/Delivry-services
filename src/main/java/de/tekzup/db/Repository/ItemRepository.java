package de.tekzup.db.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
