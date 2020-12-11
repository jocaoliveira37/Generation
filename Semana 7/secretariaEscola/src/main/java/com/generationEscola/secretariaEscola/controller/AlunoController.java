package com.generationEscola.secretariaEscola.controller;

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

import com.generationEscola.secretariaEscola.model.Aluno;
import com.generationEscola.secretariaEscola.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AlunoController {

	@Autowired //
	private AlunoRepository repository;

	@GetMapping
	public ResponseEntity<List<Aluno>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Aluno> GetByAluno(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Aluno> post(@RequestBody Aluno aluno) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aluno));
	}

	@PutMapping
	public ResponseEntity<Aluno> put(@RequestBody Aluno aluno) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
