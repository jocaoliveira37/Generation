package com.farmacia10.farmacia10.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name= "Categoria")
public class Categoria {
	private long id;
	private String descricao;
	private boolean ativo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@NotBlank
	@Size(min = 3, max = 500)
	public String getDiscricao() {
		return descricao;
	}
	public void setDiscricao(String discricao) {
		this.descricao = discricao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
