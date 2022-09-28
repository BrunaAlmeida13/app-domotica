package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.domain.Morador;
import br.edu.infnet.appdomotica.model.service.FechaduraService;

@Controller
public class FechaduraController {

	@Autowired
	private FechaduraService fechaduraService;

	@GetMapping(value = "/fechadura/lista")
	public String telaLista(Model model, @SessionAttribute("user") Morador user) {

		model.addAttribute("listagem", fechaduraService.obterLista(user));

		return "fechadura/lista";
	}

	@GetMapping(value = "/fechadura/incluir")
	public String telaCadastro() {
		return "fechadura/cadastro";
	}

	@PostMapping(value = "/fechadura/incluir")
	public String incluir(Fechadura fechadura, @SessionAttribute("user") Morador user) {
		fechadura.setMorador(user);
		
		fechaduraService.incluir(fechadura);

		return "redirect:/fechadura/lista";
	}

	@GetMapping(value = "/fechadura/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		fechaduraService.excluir(id);

		return "redirect:/fechadura/lista";
	}
}
