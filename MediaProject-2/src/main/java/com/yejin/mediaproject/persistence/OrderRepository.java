package com.yejin.mediaproject.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import com.yejin.mediaproject.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
//	SELECT * FROM seller WHERE username = ?1;
	Optional <List<Order>> findByUserId(Integer userid);
	
}
