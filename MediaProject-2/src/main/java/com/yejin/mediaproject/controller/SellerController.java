package com.yejin.mediaproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yejin.mediaproject.persistence.SellerRepository;
import com.yejin.mediaproject.persistence.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.function.Supplier;
import com.yejin.mediaproject.exception.MediaProjectException;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.yejin.mediaproject.domain.Item;
import com.yejin.mediaproject.domain.Seller;
import com.yejin.mediaproject.dto.ResponseDTO;
import com.yejin.mediaproject.service.SellerService;



@Controller
public class SellerController {

	@Autowired
	private SellerRepository sellerRepository;
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping("/auth/insertSeller")
	public String insertSeller() {
		return "auth/insertSeller";
	}
	
	@GetMapping("/seller/list")
	public @ResponseBody List<Seller> getSellerList(){
		return sellerRepository.findAll();
	}
	
	@GetMapping("/seller/{id}")
	public @ResponseBody Seller getbyId(@PathVariable Integer id) {
		
		//검색된 판매자가 없을 경우 예외 반환
		Seller findSeller = sellerRepository.findById(id).orElseThrow(()->{
			return new MediaProjectException("해당 판매자가 없습니다.");
		});
		 
		return findSeller;
	}
	
}
