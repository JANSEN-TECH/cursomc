package com.etchbr.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etchbr.cursomc.domain.Categoria;
import com.etchbr.cursomc.domain.Produto;

@Repository
public interface CategoriaRepository extends JpaRepository< Produto, Integer>{

	void saveAll(List<Categoria> asList);

}
