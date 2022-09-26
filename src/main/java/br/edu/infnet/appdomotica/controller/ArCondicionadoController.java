package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.service.ArCondicionadoService;

@Controller
@Order(5)
public class ArCondicionadoController {
	
	@Autowired
	private ArCondicionadoService arCondicionadoService;
	
	@GetMapping(value = "/arcondicionado/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", arCondicionadoService.obterLista());
		
		return "arCondicionado/lista";
	}
	
	@GetMapping(value = "/arCondicionado/incluir")
	public String telaCadastro() {
		return "arCondicionado/cadastro";
	}

	@PostMapping(value = "/arCondicionado/incluir")
	public String incluir(ArCondicionado arCondicionado) {

		arCondicionadoService.incluir(arCondicionado);

		return "redirect:/arCondicionado/lista";
	}
	
	@GetMapping(value = "/arcondicionado/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		arCondicionadoService.excluir(id);
		
		return "redirect:/arcondicionado/lista";
	}
}
