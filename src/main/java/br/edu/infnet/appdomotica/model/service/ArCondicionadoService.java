package br.edu.infnet.appdomotica.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.ArCondicionado;

@Service
public class ArCondicionadoService {
	
	private static Map<Integer, ArCondicionado> mapaAC = new HashMap<Integer, ArCondicionado>();
	private static Integer id = 1;
	
	public void incluir(ArCondicionado ac) {
		ac.setId(id++);
		mapaAC.put(ac.getId(), ac);
		
		AppImpressao.relatorio("Configuração do A.C.'" + ac.getNome() + "'", ac); 
	}
	
	public Collection<ArCondicionado> obterLista() {
		return mapaAC.values();
	}
	
	public void excluir(Integer id) {
		mapaAC.remove(id);
	}	
	
	// TODO tela e rota de cadastro
}
