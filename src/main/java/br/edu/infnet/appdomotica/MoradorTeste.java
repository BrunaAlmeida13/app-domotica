package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.controller.MoradorController;
import br.edu.infnet.appdomotica.model.domain.Morador;

@Component
public class MoradorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Morador morador = new Morador();
		morador.setNome("Nina");
		morador.setEmail("nina@email.com");
		morador.setSenha("1234");
		
		MoradorController.incluir(morador);
	}

}
