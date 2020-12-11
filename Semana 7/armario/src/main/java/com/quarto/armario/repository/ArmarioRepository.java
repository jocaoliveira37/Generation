package com.quarto.armario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quarto.armario.model.Armario;

public interface ArmarioRepository extends JpaRepository<Armario, Long> {
	public List <Armario> findAllByTipoContainingIgnoreCase(String tipo);
}
