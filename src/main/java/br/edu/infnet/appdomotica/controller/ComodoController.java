package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdomotica.model.service.ComodoService;

@Controller
public class ComodoController {

	@Autowired
	private ComodoService comodoService;
	
	@GetMapping(value = "/comodo/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", comodoService.obterLista());
		
		return "comodo/lista";
	}
	
	@GetMapping(value = "/comodo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		comodoService.excluir(id);
		
		return "redirect:/comodo/lista";
	}
}
