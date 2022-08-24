package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.controller.ResponsavelAparelhosController;
import br.edu.infnet.appdomotica.model.domain.Responsavel;

@Component
public class ResponsavelTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) {
		
		try {
			Responsavel resp1 = new Responsavel("responsavel1@email.com", "usu1", "658487891269", "61456987263");
			ResponsavelAparelhosController.incluir(resp1);
		} catch (Exception e) {
			System.out.println("[Erro] " + e.getMessage());
		}
		
		try {
			Responsavel resp2 = new Responsavel("responsavel2@email.com", "usu2", "658484578969", "61547548263");
			ResponsavelAparelhosController.incluir(resp2);
		} catch (Exception e) {
			System.out.println("[Erro] " + e.getMessage());
		}
		
		try {
			Responsavel resp3 = new Responsavel("responsavel3@email.com", "usu3", "658487565869", "61548467963");
			ResponsavelAparelhosController.incluir(resp3);
		} catch (Exception e) {
			System.out.println("[Erro] " + e.getMessage());
		}
		
		try {
			Responsavel resp4 = new Responsavel("responsavel4@email.com", "usu4", null, "61548447963");
			ResponsavelAparelhosController.incluir(resp4);
		} catch (Exception e) {
			System.out.println("[Erro] " + e.getMessage());
		}
		
		try {
			Responsavel resp5 = new Responsavel("responsavel5@email.com", "usu5", "", "61548465963");
			ResponsavelAparelhosController.incluir(resp5);
		} catch (Exception e) {
			System.out.println("[Erro] " + e.getMessage());
		}
	}
}
