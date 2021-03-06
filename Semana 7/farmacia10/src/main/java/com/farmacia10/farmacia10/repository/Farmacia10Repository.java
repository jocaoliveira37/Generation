package com.farmacia10.farmacia10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia10.farmacia10.model.Categoria;

@Repository
public interface Farmacia10Repository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByDiscricaoContainingIgnoreCase (String discricao);
	

}
