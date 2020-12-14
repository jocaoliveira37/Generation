package com.eletroeletronicos.loja.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_TipoEletro")
public class TipoEletro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 3, max = 300)
	private String descricao;

	private boolean ativo;

	@OneToMany(mappedBy = "tipoeletro", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tipoeletro")
	private List<Produto> tipoeletro;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<Produto> getTipoeletro() {
		return tipoeletro;
	}

	public void setTipoeletro(List<Produto> tipoeletro) {
		this.tipoeletro = tipoeletro;
	}

}
