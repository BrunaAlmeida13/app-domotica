package br.edu.infnet.appdomotica.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.domain.Morador;

@Controller
public class LuzController {

	private static Map<Integer, Luz> mapaLuz = new HashMap<Integer, Luz>();
	private static Integer id = 1;

	public static void incluir(Luz luz) {
		luz.setId(id++);
		mapaLuz.put(luz.getId(), luz);

		AppImpressao.relatorio("Configuração Luz '" + luz.getNome() + "'", luz);
	}

	public static void excluir(Integer id) {
		mapaLuz.remove(id);
	}

	public static Collection<Luz> obterLista() {
		return mapaLuz.values();
	}

	@GetMapping(value = "/luz/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "luz/lista";
	}

	@PostMapping(value = "/luz/incluir")
	public String inclusao(Luz luz) {

		incluir(luz);

		return "redirect:/luz/lista";
	}

	@GetMapping(value = "/luz/cadastrar")
	public String cadastrar() {
		return "/luz/cadastro";
	}

	@GetMapping(value = "/luz/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);

		return "redirect:/luz/lista";
	}

}
