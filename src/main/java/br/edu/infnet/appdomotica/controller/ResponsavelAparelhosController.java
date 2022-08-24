package br.edu.infnet.appdomotica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Responsavel;

public class ResponsavelAparelhosController {
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
	
	public static void excluir(Integer id) {
		mapaResponsavel.remove(id);
	}
	
	@GetMapping(value = "/responsavel/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/responsavel/lista";
	}
}
