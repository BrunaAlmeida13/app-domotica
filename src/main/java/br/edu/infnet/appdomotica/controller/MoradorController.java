package br.edu.infnet.appdomotica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.domain.Morador;

@Controller
public class MoradorController {
	
	private static Map<String, Morador> mapaMorador = new HashMap<String, Morador>();
	
	public static void incluir(Morador morador) {
		
		mapaMorador.put(morador.getEmail(), morador);
		
		AppImpressao.relatorio("Inclusão do morador '" + morador.getNome() + "'", morador);
	}
	
	public static Collection<Morador> obterLista() {
		return mapaMorador.values();
	}
	
	@GetMapping(value = "/morador/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "morador/lista";
	}
}
