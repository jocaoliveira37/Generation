package com.exercicio0712.exercicio0712.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proatividade")
public class proatividadeController {
	@GetMapping
	public String proatividade() {
		return "Habilidade para conseguirmos continuar caminhando.";
	}
	

}
