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
		System.out.println("#Comodo");
		
		Luz luz = new Luz();
		Fechadura fechadura = new Fechadura();
		ArCondicionado ac = new ArCondicionado();
		
		//Exemplo: acrescentar o aparelho luz no cômodo
		Luz luz1 = new Luz();
		luz1.cor = "azul";
		luz1.intensidade = 2;
		luz1.volumeSom = 50;
		luz1.power = true;
		Comodo comodo1 = new Comodo();
		comodo1.listaAparelhos.add(luz1);
		comodo1.listaAparelhos.add(ac);
		comodo1.tipo = "Quarto";
		comodo1.nome = "Quarto da Nina";
		System.out.println(comodo1);
		
		Comodo comodo2 = new Comodo();
		comodo2.listaAparelhos.add(luz);
		comodo2.listaAparelhos.add(ac);
		comodo2.tipo = "Quarto";
		comodo2.nome = "Quarto Suíte";
		System.out.println(comodo2);
		
		Comodo comodo3 = new Comodo();
		comodo3.listaAparelhos.add(luz);
		comodo3.listaAparelhos.add(ac);
		comodo3.listaAparelhos.add(fechadura);
		comodo3.tipo = "Cozinha";
		comodo3.nome = "Quarto da Nina";
		System.out.println(comodo3);
	}
}
