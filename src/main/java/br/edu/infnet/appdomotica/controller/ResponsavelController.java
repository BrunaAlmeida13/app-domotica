package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdomotica.model.domain.Responsavel;
import br.edu.infnet.appdomotica.model.service.ResponsavelService;

@Controller
public class ResponsavelController {
	
	@Autowired
	private ResponsavelService responsavelService;
	
	@GetMapping(value = "/responsavel/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", responsavelService.obterLista());
		
		return "responsavel/lista";
	}

	@GetMapping(value = "/responsavel/incluir")
	public String telaCadastro() {
		return "responsavel/cadastro";
	}

	@PostMapping(value = "/responsavel/incluir")
	public String incluir(Responsavel responsavel) {

		responsavelService.incluir(responsavel);

		return "redirect:/responsavel/lista";
	}
	
	@GetMapping(value = "/responsavel/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		responsavelService.excluir(id);
		
		return "redirect:/responsavel/lista";
	}
}
