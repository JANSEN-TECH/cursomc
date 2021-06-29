package com.etchbr.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etchbr.cursomc.domain.Categoria;
import com.etchbr.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = Optional.empty();
		return obj.orElse(null);
	}

	public Categoria buscar(Integer id) {
		return null;
	}
}
