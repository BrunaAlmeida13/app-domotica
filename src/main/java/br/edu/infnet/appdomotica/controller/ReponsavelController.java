package br.edu.infnet.appdomotica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReponsavelController {
	
	@GetMapping(value = "/responsavel/lista")
	public String telaHome() {
		return "responsavel/lista";
	}
}
