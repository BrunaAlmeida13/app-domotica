package br.edu.infnet.appdomotica.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdomotica.model.domain.Aparelho;

@Service
public class AparelhoService {
	
	@Autowired
	private LuzService luzService;
	
	@Autowired
	private FechaduraService fechaduraService;
	
	@Autowired
	private ArCondicionadoService arCondicionadoService;
	
	public List<Aparelho> obterLista() {
		
		List<Aparelho> aparelhos = new ArrayList<Aparelho>();
		aparelhos.addAll(luzService.obterLista());
		aparelhos.addAll(fechaduraService.obterLista());
		aparelhos.addAll(arCondicionadoService.obterLista());
		
		return aparelhos;
	}
}
