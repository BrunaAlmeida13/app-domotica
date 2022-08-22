package br.edu.infnet.appdomotica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdomotica.model.domain.Comodo;
import br.edu.infnet.appdomotica.model.test.AppImpressao;

@Controller
public class ComodoController {
	
	private static Map<Integer, Comodo> mapaComodo = new HashMap<Integer, Comodo>();
	private static Integer id = 1;
	
	public static void incluir(Comodo comodo) {
		
		comodo.setId(id++);
		mapaComodo.put(comodo.getId(), comodo);
		
		AppImpressao.relatorio("Configuração do comodo '" + comodo.getNome() + "'", comodo);
	}
	
	public static Collection<Comodo> obterLista() {
		return mapaComodo.values();
	}
	
	@GetMapping(value = "/comodo/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "comodo/lista";
	}
	
	public static void excluir(Integer id) {
		mapaComodo.remove(id);
	}
	
	@GetMapping(value = "/comodo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/comodo/lista";
	}
}
