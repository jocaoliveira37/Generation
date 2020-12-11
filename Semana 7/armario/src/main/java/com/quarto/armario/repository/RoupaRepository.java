package com.quarto.armario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quarto.armario.model.Roupa;

public interface RoupaRepository extends JpaRepository<Roupa, Long> {
	public List <Roupa> findAllByTipoContainingIgnoreCase(String tipo);

}
