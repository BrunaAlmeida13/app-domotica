package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.ArCondicionado;

@Component
public class ArCondicionadoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#ArCondicionado");
		
		ArCondicionado ac1 = new ArCondicionado();
		ac1.temperatura = 22.0;
		ac1.ventilacao = false;
		ac1.power = true;
		System.out.println(ac1);
		
		ArCondicionado ac2 = new ArCondicionado();
		ac2.temperatura = 22.0;
		ac2.ventilacao = false;
		ac2.power = true;
		System.out.println(ac2);
		
		ArCondicionado ac3 = new ArCondicionado();
		ac3.temperatura = 22.0;
		ac3.ventilacao = false;
		ac3.power = true;
		System.out.println(ac3);	
	}
}
