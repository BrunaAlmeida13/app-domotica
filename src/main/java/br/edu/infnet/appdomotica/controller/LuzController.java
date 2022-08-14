package br.edu.infnet.appdomotica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LuzController {
	
	@GetMapping(value = "/luz/lista")
	public String telaHome() {
		return "luz/lista";
	}
}
