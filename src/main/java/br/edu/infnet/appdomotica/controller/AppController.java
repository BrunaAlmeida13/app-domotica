package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appdomotica.model.domain.Morador;
import br.edu.infnet.appdomotica.model.service.MoradorService;

@Controller
public class AppController {
	
	@Autowired
	private MoradorService moradorService;
	
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
		
		Morador morador = moradorService.validar(email, senha);
		
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
