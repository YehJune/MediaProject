package com.yejin.mediaproject.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yejin.mediaproject.domain.Item;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
//	SELECT * FROM seller WHERE username = ?1;
	Optional<List<Item>> findBySellerUsername(String sellerusername);
	
}
