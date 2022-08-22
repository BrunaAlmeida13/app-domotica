package br.edu.infnet.appdomotica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appdomotica.model.domain.Responsavel;
import br.edu.infnet.appdomotica.model.test.AppImpressao;

@Controller
public class ResponsavelController {
	
	private static Map<Integer, Responsavel> mapaResponsavel = new HashMap<Integer, Responsavel>();
	private static Integer id = 1;
	
	public static void incluir(Responsavel responsavel) {

		responsavel.setId(id++);
		mapaResponsavel.put(responsavel.getId(), responsavel);
		
		AppImpressao.relatorio("Criação do responsável '" + responsavel.getLogin() + "'", responsavel); 
	}
	
	public static Collection<Responsavel> obterLista() {
		return mapaResponsavel.values();
	}
	
	@GetMapping(value = "/responsavel/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "responsavel/lista";
	}
}