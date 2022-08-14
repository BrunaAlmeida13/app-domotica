package br.edu.infnet.appdomotica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FechaduraController {

	@GetMapping(value = "/fechadura/lista")
	public String telaHome() {
		return "fechadura/lista";
	}
}
