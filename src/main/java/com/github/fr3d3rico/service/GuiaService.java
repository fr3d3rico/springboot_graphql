package com.github.fr3d3rico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.fr3d3rico.dao.GuiaRepository;
import com.github.fr3d3rico.types.Guia;

@Service
public class GuiaService {
	
	@Autowired
	GuiaRepository guiaRepository;
	
	public Guia findByNumeroGuiaCompleto(Long numeroGuiaCompleto) {
		return guiaRepository.findByNumeroGuiaCompleto(numeroGuiaCompleto);
	}
	
	public List<Guia> findAll() {
		return guiaRepository.findAll();
	}

}
