package com.eletroeletronicos.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletroeletronicos.loja.model.TipoEletro;

public interface TipoEletroRepository extends JpaRepository<TipoEletro, Long> {
	public List<TipoEletro> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
