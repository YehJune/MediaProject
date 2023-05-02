package com.yejin.mediaproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yejin.mediaproject.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
public class RESTController {
	//GET: SELECT
	@GetMapping("/mediaproject")
	public User httpGet() {
		User findUser = User.builder()
				.id(1)
				.username("sohee")
				.password("123")
				.email("sohee123@ajou.ac.kr")
			.build();
		return findUser;
	}
	//POST: INSERT
	@PostMapping("/mediaproject")
	public String httpPost(@RequestBody User user) {
		return "POST 요청 처리 입력값: " + user.toString();
	}
	//PUT: UPDATE
	@PutMapping("/mediaproject")
	public String httpPut(@RequestBody User user) {
		return "POST 요청 처리 입력값: " + user.toString();
	}
	//DELETE: DELETE
	@DeleteMapping("/mediaproject")
	public String httpDelete(@RequestParam int id) {
		return "DELETE 요청 처리 입력값: "+id;
	}
	
}
