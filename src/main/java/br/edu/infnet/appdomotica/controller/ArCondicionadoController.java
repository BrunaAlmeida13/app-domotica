package br.edu.infnet.appdomotica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArCondicionadoController {
	
	@GetMapping(value = "/arcondicionado/lista")
	public String telaHome() {
		return "arCondicionado/lista";
	}
}
