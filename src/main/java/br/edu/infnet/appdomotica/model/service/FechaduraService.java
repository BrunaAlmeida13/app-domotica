package br.edu.infnet.appdomotica.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Fechadura;

@Service
public class FechaduraService {
	private static Map<Integer, Fechadura> mapaFechadura = new HashMap<Integer, Fechadura>();
	private static Integer id = 1;
	
	public void incluir(Fechadura fechadura) {
		fechadura.setId(id++);
		mapaFechadura.put(fechadura.getId(), fechadura);
		
		AppImpressao.relatorio("Configuração da Fechadura '" + fechadura.getNome() + "'", fechadura); 
	}
	
	public Collection<Fechadura> obterLista() {
		return mapaFechadura.values();
	}
	

	public void excluir(Integer id) {
		mapaFechadura.remove(id);
	}
}
