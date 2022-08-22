package br.edu.infnet.appdomotica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.test.AppImpressao;

@Controller
public class ArCondicionadoController {
	
	private static Map<Integer, ArCondicionado> mapaAC = new HashMap<Integer, ArCondicionado>();
	private static Integer id = 1;
	
	public static void incluir(ArCondicionado ac) {
		ac.setId(id++);
		mapaAC.put(ac.getId(), ac);
		
		AppImpressao.relatorio("Configuração do A.C.'" + ac.getNome() + "'", ac); 
	}
	
	public static Collection<ArCondicionado> obterLista() {
		return mapaAC.values();
	}
	
	@GetMapping(value = "/arcondicionado/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "arCondicionado/lista";
	}
	
	public static void excluir(Integer id) {
		mapaAC.remove(id);
	}
	
	@GetMapping(value = "/arcondicionado/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/arcondicionado/lista";
	}
}
