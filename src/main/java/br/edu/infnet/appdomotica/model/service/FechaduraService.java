package br.edu.infnet.appdomotica.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdomotica.model.AppImpressao;
import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.repository.FechaduraRepository;

@Service
public class FechaduraService {
	
	@Autowired
	private FechaduraRepository fechaduraRepository;
	
	public void incluir(Fechadura fechadura) {
		fechadura.status();
		fechaduraRepository.save(fechadura);
		
		AppImpressao.relatorio("Configuração da Fechadura '" + fechadura.getNome() + "'", fechadura); 
	}
	
	public Collection<Fechadura> obterLista() {
		return (Collection<Fechadura>) fechaduraRepository.findAll();
	}
	

	public void excluir(Integer id) {
		fechaduraRepository.deleteById(id);
	}
}
