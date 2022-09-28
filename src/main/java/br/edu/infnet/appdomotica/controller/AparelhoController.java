package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appdomotica.model.service.AparelhoService;

@Controller
public class AparelhoController {

	@Autowired
	private AparelhoService aparelhoService;	
	
	@GetMapping(value = "/aparelho/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", aparelhoService.obterLista());

		return "aparelho/lista";
	}

	/*@GetMapping(value = "/luz/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		aparelhoService.excluir(id);

		return "redirect:/luz/lista";
	}*/

}
