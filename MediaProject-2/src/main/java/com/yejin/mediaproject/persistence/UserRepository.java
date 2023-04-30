package com.yejin.mediaproject.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yejin.mediaproject.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
		
}
