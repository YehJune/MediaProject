package com.yejin.mediaproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yejin.mediaproject.persistence.UserRepository;
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
import com.yejin.mediaproject.domain.Seller;
import com.yejin.mediaproject.dto.ResponseDTO;
import com.yejin.mediaproject.service.SellerService;



@Controller
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	@GetMapping("/auth/insertSeller")
	public String insertSeller() {
		return "user/insertSeller";
	}
	
	@PostMapping("/auth/insertSeller")
	public @ResponseBody ResponseDTO<?> insertSeller(@RequestBody Seller seller){
		Seller findSeller = sellerService.getSeller(seller.getUsername());
		
		if(findSeller.getUsername() == null) {
			sellerService.insertSeller(seller);
			return new ResponseDTO<>(HttpStatus.OK.value(),seller.getUsername() + "가입 성공했습니다.");
		}else {
			return new ResponseDTO<>(HttpStatus.BAD_REQUEST.value(),
					seller.getUsername() + "님은 이미 회원입니다.");
		}
	
	}
}
