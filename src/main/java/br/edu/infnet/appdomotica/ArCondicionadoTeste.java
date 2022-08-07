package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.ArCondicionado;

@Component
public class ArCondicionadoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#ArCondicionado");
		
		ArCondicionado ac1 = new ArCondicionado();
		ac1.nome = "A.C. quarto suíte";
		ac1.status = "Ligado";
		ac1.timerInicio = null;
		ac1.timerFim = null;
		ac1.temperatura = 22.0;
		ac1.ventilacao = true;
		ac1.power = true;
		System.out.println(ac1);
		
		ArCondicionado ac2 = new ArCondicionado();
		ac2.nome = "A.C. quarto Nina";
		ac2.status = "Ligado";
		ac2.timerInicio = null;
		ac2.timerFim = null;
		ac2.temperatura = 22.0;
		ac2.ventilacao = false;
		ac2.power = true;
		System.out.println(ac2);
		
		ArCondicionado ac3 = new ArCondicionado();
		ac3.nome = "A.C. Sala";
		ac3.status = "Ligado";
		ac3.timerInicio = null;
		ac3.timerFim = null;
		ac3.temperatura = 22.0;
		ac3.ventilacao = false;
		ac3.power = true;
		System.out.println(ac3);	
	}
}
