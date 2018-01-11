package com.github.fr3d3rico.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.fr3d3rico.service.GuiaService;
import com.github.fr3d3rico.service.ItemService;
import com.github.fr3d3rico.types.Guia;
import com.github.fr3d3rico.types.Item;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
	GuiaService guiaService;
	
	@Autowired
	ItemService itemService;
	
	public List<Guia> findAll() {
		return guiaService.findAll();
	}
	
	public Guia findByNumeroGuiaCompleto(String numeroGuiaCompleto) {
		Guia guia = guiaService.findByNumeroGuiaCompleto(Long.parseLong(numeroGuiaCompleto));
		if( guia != null && guia.getId() != null ) {
			guia.setItemList(itemService.findAllItem(guia.getId()));
		}
		return guia;
	}
	
	public List<Item> findAllItem(Long id) {
		return itemService.findAllItem(id);
	}

}
