package br.edu.infnet.appdomotica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.service.LuzService;

@Controller
public class LuzController {

	@Autowired
	private LuzService luzService;	
	
	@GetMapping(value = "/luz/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", luzService.obterLista());

		return "luz/lista";
	}

	//TODO implementar cadastro
	@PostMapping(value = "/luz/incluir")
	public String inclusao(Luz luz) {

		luzService.incluir(luz);

		return "luz/cadastro";
	}

	/*@GetMapping(value = "/luz/cadastrar")
	public String cadastrar(Luz luz) {
		incluir(luz);
		return "/luz/cadastro";
	}*/

	@GetMapping(value = "/luz/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		luzService.excluir(id);

		return "redirect:/luz/lista";
	}

}
