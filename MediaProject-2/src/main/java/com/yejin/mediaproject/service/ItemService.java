package com.yejin.mediaproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yejin.mediaproject.domain.RoleType;
import com.yejin.mediaproject.domain.Seller;
import com.yejin.mediaproject.domain.Item;
import com.yejin.mediaproject.persistence.ItemRepository;

import java.util.List;
import java.util.ArrayList;

import java.util.function.Supplier;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	@Transactional(readOnly = true)
	public List<Item> getItem(String sellerusername) {
		//검색 결과가 없을 때 빈 User 객체 반환
		List<Item> findUser = itemRepository.findBySellerUsername(sellerusername).orElseGet(
				new Supplier<List<Item>>() {
					@Override
					public List<Item> get() {
						return new ArrayList<Item>();
					}
				});
		return findUser;
	}
	
	
	@Transactional(readOnly = true)
	public Page<Item> getItemList(Pageable pageable){
		return itemRepository.findAll(pageable);
	}
	
	
}
