package com.quarto.armario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quarto.armario.model.Roupa;
import com.quarto.armario.repository.RoupaRepository;

@RestController
@RequestMapping("/roupas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RoupaController {

	@Autowired // Não quero injetar dependência!!!
	private RoupaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Roupa>> GetAll(){
		return ResponseEntity.ok(repository.findAll());		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Roupa> GetByRoupa(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Roupa> post (@RequestBody Roupa roupa){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(roupa));
		}
	@PutMapping
	public ResponseEntity<Roupa> put (@RequestBody Roupa roupa){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(roupa));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
