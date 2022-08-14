package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.domain.Comodo;
import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.domain.Luz;

@Component
public class ComodoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Luz luz = new Luz();
		Fechadura fechadura = new Fechadura();
		ArCondicionado ac = new ArCondicionado();
		
		//Exemplo: acrescentar o aparelho luz no cômodo
		Luz luz1 = new Luz();
		luz1.setCor("azul");
		luz1.setIntensidade(2);
		luz1.setVolumeSom(50);
		luz1.setPower(true);
		Comodo comodo1 = new Comodo();
		comodo1.getListaAparelhos().add(luz1);
		comodo1.getListaAparelhos().add(ac);
		comodo1.setTipo("Quarto");
		comodo1.setNome("Quarto da Nina");
		System.out.println(comodo1);
		
		Comodo comodo2 = new Comodo();
		comodo2.getListaAparelhos().add(luz);
		comodo2.getListaAparelhos().add(ac);
		comodo2.setTipo("Quarto");
		comodo2.setNome("Quarto Suíte");
		System.out.println(comodo2);
		
		Comodo comodo3 = new Comodo();
		comodo3.getListaAparelhos().add(luz);
		comodo3.getListaAparelhos().add(ac);
		comodo3.getListaAparelhos().add(fechadura);
		comodo3.setTipo("Cozinha");
		comodo3.setNome("Cozinha");
		System.out.println(comodo3);
	}
}
