package br.edu.infnet.appdomotica.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Luz;

@Service
public class LuzService {
	
	private static Map<Integer, Luz> mapaLuz = new HashMap<Integer, Luz>();
	private static Integer id = 1;

	public void incluir(Luz luz) {
		luz.setId(id++);
		mapaLuz.put(luz.getId(), luz);

		AppImpressao.relatorio("Configuração Luz '" + luz.getNome() + "'", luz);
	}

	public void excluir(Integer id) {
		mapaLuz.remove(id);
	}

	public Collection<Luz> obterLista() {
		return mapaLuz.values();
	}
}
