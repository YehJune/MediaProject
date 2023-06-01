package com.yejin.mediaproject.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yejin.mediaproject.domain.Seller;
import java.util.Optional;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{
//	SELECT * FROM seller WHERE username = ?1;
	Optional<Seller> findByUsername(String username);
	
}
