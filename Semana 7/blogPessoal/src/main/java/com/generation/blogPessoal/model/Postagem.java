package com.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Postagem")

public class Postagem {
	private long id;
	private String title;
	private String text;
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@NotNull
	@Size(min = 5, max = 100)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@NotNull
	@Size(min = 10, max = 500)
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Temporal(TemporalType.TIMESTAMP)	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}	
	
}
