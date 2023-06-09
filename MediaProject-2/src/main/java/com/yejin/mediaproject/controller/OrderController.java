package com.yejin.mediaproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yejin.mediaproject.domain.Order;
import com.yejin.mediaproject.domain.User;
import com.yejin.mediaproject.persistence.OrderRepository;
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
import com.yejin.mediaproject.dto.ResponseDTO;
import com.yejin.mediaproject.service.OrderService;
import com.yejin.mediaproject.service.UserService;



@Controller
public class OrderController {
	@Autowired
	private OrderRepository orderRepository;


//	
//	@PostMapping("/user")
//	public @ResponseBody String insertUser(@RequestBody User user) {
//		user.setRole(RoleType.USER);
//		userRepository.save(user);
//		return user.getUsername() + "회원가입 성공";
//	}
//
	
	@GetMapping("/order/list/{userid}")
	public @ResponseBody List<Order> getListbyUserIds(@PathVariable Integer userid) {
		
		//검색된 상품이 없을 경우 예외 반환
		List<Order> findOrder = orderRepository.findByUserId(userid).orElseThrow(()->{
			return new MediaProjectException("주문내역이 없습니다.");
		});
		return findOrder;
	}
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order/insertOrder")
	public @ResponseBody ResponseDTO<?> insertOrder(@RequestBody Order order){
			orderService.insertOrder(order);
			return new ResponseDTO<>(HttpStatus.OK.value(), "주문완료되었습니다.");

	}
//	@GetMapping("/item/list")
//	public @ResponseBody List<Item> getItemList(){
//		return itemRepository.findAll();
//	}
//	
//	@GetMapping("/item/{id}")
//	public @ResponseBody Item getbyId(@PathVariable Integer id) {
//		
//		//검색된 상품이 없을 경우 예외 반환
//		Item findItem = itemRepository.findById(id).orElseThrow(()->{
//			return new MediaProjectException("해당 상품이 없습니다.");
//		});
//		return findItem;
//	}
//	
}
