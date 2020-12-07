package com.exercicio0712.exercicio0712.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persistencia")
public class PersistenciaController {
		
	@GetMapping
	public String Persistencia() {
		return "Uma mentalidade necessária, pois precisamos de muita persistencia para compreender esses desafios.";
			}

}
