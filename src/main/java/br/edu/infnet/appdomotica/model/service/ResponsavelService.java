package br.edu.infnet.appdomotica.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Responsavel;

@Service
public class ResponsavelService {
	
	private static Map<Integer, Responsavel> mapaResponsavel = new HashMap<Integer, Responsavel>();
	private static Integer id = 1;
	
	public void incluir(Responsavel responsavel) {

		responsavel.setId(id++);
		mapaResponsavel.put(responsavel.getId(), responsavel);
		
		AppImpressao.relatorio("Criação do responsável '" + responsavel.getLogin() + "'", responsavel); 
	}
	
	public Collection<Responsavel> obterLista() {
		return mapaResponsavel.values();
	}
	
	public void excluir(Integer id) {
		mapaResponsavel.remove(id);
	}
}
