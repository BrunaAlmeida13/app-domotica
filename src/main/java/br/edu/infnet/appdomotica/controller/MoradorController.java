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
import br.edu.infnet.appdomotica.model.domain.Morador;

@Controller
public class MoradorController {

	private static Map<String, Morador> mapaMorador = new HashMap<String, Morador>();

	public static Morador validar(String email, String senha) {
		Morador morador = mapaMorador.get(email);

		if (morador != null && senha.equals(morador.getSenha())) {
			return morador;
		}

		return null;
	}

	public static void incluir(Morador morador) {

		mapaMorador.put(morador.getEmail(), morador);

		AppImpressao.relatorio("Inclusão do morador '" + morador.getNome() + "'", morador);
	}
	
	public static void excluir(String email) {
		mapaMorador.remove(email);
	}

	public static Collection<Morador> obterLista() {
		return mapaMorador.values();
	}

	@GetMapping(value = "/morador/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "morador/lista";
	}

	@GetMapping(value = "/morador")
	public String telaCadastro() {
		return "morador/cadastro";
	}

	@PostMapping(value = "/morador/incluir")
	public String inclusao(Morador morador) {
		
		incluir(morador);

		return "redirect:/";
	}
	
	@GetMapping(value = "/morador/{email}/excluir")
	public String exclusao(@PathVariable String email) {
		
		excluir(email);

		return "redirect:/morador/lista";
	}
}
