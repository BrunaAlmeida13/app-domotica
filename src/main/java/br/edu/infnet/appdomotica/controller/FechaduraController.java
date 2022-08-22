package br.edu.infnet.appdomotica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.test.AppImpressao;

@Controller
public class FechaduraController {

	private static Map<Integer, Fechadura> mapaFechadura = new HashMap<Integer, Fechadura>();
	private static Integer id = 1;
	
	public static void incluir(Fechadura fechadura) {
		fechadura.setId(id++);
		mapaFechadura.put(fechadura.getId(), fechadura);
		
		AppImpressao.relatorio("Configuração da Fechadura '" + fechadura.getNome() + "'", fechadura); 
	}
	
	public static Collection<Fechadura> obterLista() {
		return mapaFechadura.values();
	}
	
	@GetMapping(value = "/fechadura/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "fechadura/lista";
	}
	
	public static void excluir(Integer id) {
		mapaFechadura.remove(id);
	}
	
	@GetMapping(value = "/fechadura/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/fechadura/lista";
	}
}
