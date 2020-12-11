package com.generationEscola.secretariaEscola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generationEscola.secretariaEscola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	public List <Aluno> findAllByNomeContainingIgnoreCase(String nome);
 
}
