package com.yejin.mediaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.yejin.mediaproject.domain.User;
import com.yejin.mediaproject.persistence.UserDAO;

@SpringBootTest
public class UserDAOTest {
	@Autowired
	private UserDAO userDAO;

	@Test
	void getUserListTest() {
		User user = new User();
		user.setUsername("test3");
		user.setPassword("test123");
		user.setEmail("test@gmail.com");

		int before = userDAO.getUserList().size();
		userDAO.insertUser(user);
		int after = userDAO.getUserList().size();

		assertEquals(before + 1, after);
	}
	
}