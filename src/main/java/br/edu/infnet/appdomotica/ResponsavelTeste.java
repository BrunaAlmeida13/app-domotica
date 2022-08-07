package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Responsavel;

@Component
public class ResponsavelTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Responsavel");
		
		Responsavel resp1 = new Responsavel();
		resp1.login = "responsavel1@email.com";
		resp1.senha = "usu1";
		resp1.cpf = "658487891269";
		resp1.telefone = "61456987263";
		System.out.println(resp1);
		
		Responsavel resp2 = new Responsavel();
		resp2.login = "responsavel2@email.com";
		resp2.senha = "usu2";
		resp2.cpf = "658484578969";
		resp2.telefone = "61547548263";
		System.out.println(resp2);
		
		Responsavel resp3 = new Responsavel();
		resp3.login = "responsavel3@email.com";
		resp3.senha = "usu3";
		resp3.cpf = "658487565869";
		resp3.telefone = "61548467963";
		System.out.println(resp3);
	}
}
