package com.github.fr3d3rico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.fr3d3rico.dao.ItemRepository;
import com.github.fr3d3rico.types.Item;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> findAllItem(Long id) {
		return itemRepository.findAllItem(id);
	}

}
