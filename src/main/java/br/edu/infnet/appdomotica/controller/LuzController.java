package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.domain.Morador;
import br.edu.infnet.appdomotica.model.service.LuzService;
import br.edu.infnet.appdomotica.model.service.MoradorService;

@Controller
public class LuzController {

	@Autowired
	private LuzService luzService;	
	
	@GetMapping(value = "/luz/lista")
	public String telaLista(Model model, @SessionAttribute("user") Morador user) {

		model.addAttribute("listagem", luzService.obterLista(user));

		return "luz/lista";
	}

	@GetMapping(value = "/luz/incluir")
	public String telaCadastro() {
		return "luz/cadastro";
	}

	@PostMapping(value = "/luz/incluir")
	public String incluir(Luz luz, @SessionAttribute("user") Morador user) {
		luz.setMorador(user);
		
		luzService.incluir(luz);

		return "redirect:/luz/lista";
	}

	@GetMapping(value = "/luz/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		luzService.excluir(id);

		return "redirect:/luz/lista";
	}

}
