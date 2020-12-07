package com.exercicio0712.exercicio0712.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atencaoaosdetalhes")
public class AtencaoAosDetalhesController {
	@GetMapping
	public String AtencaoAosDetralhes() {
		return "Necessitamos de atenção para produzir códigos eficazes.";
	}

}
