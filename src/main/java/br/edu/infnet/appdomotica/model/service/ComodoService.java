package br.edu.infnet.appdomotica.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Comodo;

@Service
public class ComodoService {
	
	private static Map<Integer, Comodo> mapaComodo = new HashMap<Integer, Comodo>();
	private static Integer id = 1;
	
	public void incluir(Comodo comodo) {
		
		comodo.setId(id++);
		mapaComodo.put(comodo.getId(), comodo);
		
		AppImpressao.relatorio("Configuração do comodo '" + comodo.getNome() + "'", comodo);
	}
	
	public Collection<Comodo> obterLista() {
		return mapaComodo.values();
	}
	
	
	public void excluir(Integer id) {
		mapaComodo.remove(id);
	}
}
