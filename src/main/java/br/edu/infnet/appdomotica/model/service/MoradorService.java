package br.edu.infnet.appdomotica.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Morador;

@Service
public class MoradorService {

	private static Map<String, Morador> mapaMorador = new HashMap<String, Morador>();

	public Morador validar(String email, String senha) {
		Morador morador = mapaMorador.get(email);

		if (morador != null && senha.equals(morador.getSenha())) {
			return morador;
		}

		return null;
	}

	public void incluir(Morador morador) {

		mapaMorador.put(morador.getEmail(), morador);

		AppImpressao.relatorio("Inclusão do morador '" + morador.getNome() + "'", morador);
	}

	public void excluir(String email) {
		mapaMorador.remove(email);
	}

	public Collection<Morador> obterLista() {
		return mapaMorador.values();
	}
}
