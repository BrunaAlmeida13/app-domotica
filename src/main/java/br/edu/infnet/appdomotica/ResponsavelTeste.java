package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.controller.ResponsavelController;
import br.edu.infnet.appdomotica.model.domain.Responsavel;

@Component
public class ResponsavelTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Responsavel resp1 = new Responsavel("responsavel1@email.com", "usu1", "658487891269", "61456987263");
		ResponsavelController.incluir(resp1);
		
		Responsavel resp2 = new Responsavel("responsavel2@email.com", "usu2", "658484578969", "61547548263");
		ResponsavelController.incluir(resp2);
		
		Responsavel resp3 = new Responsavel("responsavel3@email.com", "usu3", "658487565869", "61548467963");
		ResponsavelController.incluir(resp3);
	}
}
