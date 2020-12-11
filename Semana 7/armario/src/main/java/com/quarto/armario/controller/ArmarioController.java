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

import com.quarto.armario.model.Armario;
import com.quarto.armario.repository.ArmarioRepository;

@RestController
@RequestMapping("/armario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArmarioController {
	
	@Autowired // Não quero injetar dependência!!!
	private ArmarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Armario>> GetAll(){
		return ResponseEntity.ok(repository.findAll());		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Armario> GetByArmario(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Armario> post (@RequestBody Armario armario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(armario));
		}
	@PutMapping
	public ResponseEntity<Armario> put (@RequestBody Armario armario){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(armario));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
