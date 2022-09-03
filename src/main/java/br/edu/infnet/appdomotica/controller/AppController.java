package br.edu.infnet.appdomotica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appdomotica.model.domain.Morador;

@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Morador morador = MoradorController.validar(email, senha);
		
		if(morador != null) {
			
			model.addAttribute("user", morador.getNome());
			
			return "home";
		}	
		
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String logout(Model model) {
		
		model.addAttribute("user", "");
		
		return "redirect:/";
	}
}
