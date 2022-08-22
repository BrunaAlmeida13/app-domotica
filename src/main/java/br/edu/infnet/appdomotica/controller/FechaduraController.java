package br.edu.infnet.appdomotica.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.test.AppImpressao;

@Controller
public class FechaduraController {

	private static List<Fechadura> listaFechadura = new ArrayList<Fechadura>();
	private static Map<Integer, Fechadura> mapaFechadura = new HashMap<Integer, Fechadura>();
	private static Integer id = 1;
	
	public static void incluir(Fechadura fechadura) {
		listaFechadura.add(fechadura);
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
}
