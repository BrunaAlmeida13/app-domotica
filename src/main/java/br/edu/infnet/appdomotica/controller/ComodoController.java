package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdomotica.model.domain.Comodo;
import br.edu.infnet.appdomotica.model.service.AparelhoService;
import br.edu.infnet.appdomotica.model.service.ComodoService;
import br.edu.infnet.appdomotica.model.service.ResponsavelService;

@Controller
public class ComodoController {

	@Autowired
	private ComodoService comodoService;
	
	@Autowired
	private ResponsavelService responsavelService;
	
	@Autowired
	private AparelhoService aparelhoService;
	
	@GetMapping(value = "/comodo/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", comodoService.obterLista());
		
		return "comodo/lista";
	}
	
	@GetMapping(value = "/comodo")
	public String telaCadastro(Model model) {
		
		model.addAttribute("aparelhos", aparelhoService.obterLista());
		model.addAttribute("responsaveis", responsavelService.obterLista());
		
		return "comodo/cadastro";
	}

	@PostMapping(value = "/comodo/incluir")
	public String incluir() {

		//comodoService.incluir(comodo);

		return "redirect:/comodo/lista";
	}
	
	@GetMapping(value = "/comodo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		comodoService.excluir(id);
		
		return "redirect:/comodo/lista";
	}
}
