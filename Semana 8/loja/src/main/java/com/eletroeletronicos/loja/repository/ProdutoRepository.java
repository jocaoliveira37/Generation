package com.eletroeletronicos.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eletroeletronicos.loja.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	@Query (value="select * from tb_produto where preco > :valor1 and preco < :valor2", nativeQuery=true)
	public List<Produto> RangePreco(@Param("valor1") double valor1, @Param("valor2") double valor2);

	
	}

