package com.exercicio0712.exercicio0712.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidadedecrescimento")
public class MentalidadeDeCrescimentoController {
	
	@GetMapping
	public String MentalidadeDeCrescimento() {
		return "Pensar em como o que estamos aprendendo se mostra importante para nosso desenvolvimento.";
		
	}

}
