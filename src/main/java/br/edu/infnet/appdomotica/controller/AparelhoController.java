package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdomotica.model.domain.Morador;
import br.edu.infnet.appdomotica.model.service.AparelhoService;

@Controller
public class AparelhoController {

	@Autowired
	private AparelhoService aparelhoService;	
	
	@GetMapping(value = "/aparelho/lista")
	public String telaLista(Model model, @SessionAttribute("user") Morador user) {

		model.addAttribute("listagem", aparelhoService.obterLista(user));

		return "aparelho/lista";
	}

	@GetMapping(value = "/aparelho/id/excluir")
	public String excluir(@PathVariable Integer id) {
		
		aparelhoService.excluir(id);

		return "redirect:/aparelho/lista";
	}

}
