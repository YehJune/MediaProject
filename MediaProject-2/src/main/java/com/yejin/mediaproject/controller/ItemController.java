package com.yejin.mediaproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yejin.mediaproject.domain.User;
import com.yejin.mediaproject.domain.RoleType;
import com.yejin.mediaproject.persistence.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.function.Supplier;
import com.yejin.mediaproject.exception.MediaProjectException;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.yejin.mediaproject.domain.Item;
import com.yejin.mediaproject.dto.ResponseDTO;
import com.yejin.mediaproject.service.UserService;



@Controller
public class ItemController {
	@Autowired
	private ItemRepository itemRepository;
//	
//	@PostMapping("/user")
//	public @ResponseBody String insertUser(@RequestBody User user) {
//		user.setRole(RoleType.USER);
//		userRepository.save(user);
//		return user.getUsername() + "회원가입 성공";
//	}
//
	
	@GetMapping("/item/list/{sellerusername}")
	public @ResponseBody List<Item> getItemListbySellerUsername(@PathVariable String sellerusername) {
		
		//검색된 상품이 없을 경우 예외 반환
		List<Item> findItem = itemRepository.findBySellerUsername(sellerusername).orElseThrow(()->{
			return new MediaProjectException("해당 상품이 없습니다.");
		});
		return findItem;
	}
	
	@GetMapping("/item/list")
	public @ResponseBody List<Item> getItemList(){
		return itemRepository.findAll();
	}
	
	@GetMapping("/item/{id}")
	public @ResponseBody Item getbyId(@PathVariable Integer id) {
		
		//검색된 상품이 없을 경우 예외 반환
		Item findItem = itemRepository.findById(id).orElseThrow(()->{
			return new MediaProjectException("해당 상품이 없습니다.");
		});
		return findItem;
	}
	
//	
//	@Transactional
//	@PutMapping("/user")
//	public @ResponseBody String updateUser(@RequestBody User user) {
//		User findUser = userRepository.findById(user.getId()).orElseThrow(()->{
//			return new MediaProjectException(user.getId() + "번 회원이 없습니다.");
//		});
//		findUser.setUsername(user.getUsername());
//		findUser.setPassword(user.getPassword());
//		findUser.setEmail(user.getEmail());
//		findUser.setRole(user.getRole());
//		findUser.setCreateDate(user.getCreateDate());
//		findUser.setName(user.getName());
//		findUser.setMobile(user.getMobile());
//		findUser.setAddr(user.getAddr());
//		findUser.setBusNum(user.getBusNum());
//		findUser.setFarmName(user.getFarmName());
//		findUser.setRegion(user.getRegion());
//		findUser.setStory(user.getStory());
//		findUser.setProfileImg(user.getProfileImg());
//		findUser.setRevNum(user.getRevNum());
//		findUser.setScore(user.getScore());
//		findUser.setRecommand(user.getRecommand());
//
//		//userRepository.save(findUser);
//		return "회원 수정 성공";
//	}
//	
//	@DeleteMapping("/user/{id}")
//	public @ResponseBody String deleteUser(@PathVariable int id) {
//		userRepository.deleteById(id);
//		return "회원 삭제 성공";
//	}
	
//	@GetMapping("/item/list")
//	public @ResponseBody List<Item> getItemList(){
//		return itemRepository.findAll();
//	}
//	
//	@GetMapping("/user/page")
//	public @ResponseBody Page<User> getUserListPaging(
//			@PageableDefault(page = 0, size = 2, direction = Sort.Direction.DESC,
//			sort = {"id", "username"})Pageable pageable){
//		//page에 해당하는 2개의 데이터 조희
//		//id 내림차순 정렬
//		return userRepository.findAll(pageable);
//	}
//	@Autowired
//	private UserService userService;
//	
//	@GetMapping("/auth/insertUser")
//	public String insertUser() {
//		return "user/insertUser";
//	}
//	
//	@PostMapping("/auth/insertUser")
//	public @ResponseBody ResponseDTO<?> insertUser(@RequestBody User user){
//		User findUser = userService.getUser(user.getUsername());
//		
//		if(findUser.getUsername() == null) {
//			userService.insertUser(user);
//			return new ResponseDTO<>(HttpStatus.OK.value(),user.getUsername() + "가입 성공했습니다.");
//		}else {
//			return new ResponseDTO<>(HttpStatus.BAD_REQUEST.value(),
//					user.getUsername() + "님은 이미 회원입니다.");
//		}
//	
//	}
}
