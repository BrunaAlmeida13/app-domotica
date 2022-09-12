package br.edu.infnet.appdomotica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.Morador;
import br.edu.infnet.appdomotica.model.service.MoradorService;

@Component
public class MoradorTeste implements ApplicationRunner {

	@Autowired
	private MoradorService moradorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Morador morador = new Morador();
		morador.setNome("Nina");
		morador.setEmail("nina@email.com");
		morador.setSenha("1234");
		
		moradorService.incluir(morador);
	}

}
