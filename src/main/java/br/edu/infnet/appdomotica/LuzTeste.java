package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Luz;

@Component
public class LuzTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Luz");
		
		Luz luz1 = new Luz();
		luz1.cor = "azul";
		luz1.intensidade = 2;
		luz1.volumeSom = 50;
		luz1.power = true;
		System.out.println(luz1);
		
		Luz luz2 = new Luz();
		luz2.cor = "vermelho";
		luz2.intensidade = 3;
		luz2.volumeSom = 20;
		luz2.power = true;
		System.out.println(luz2);
		
		Luz luz3 = new Luz();
		luz3.cor = "";
		luz3.intensidade = 0;
		luz3.volumeSom = 0;
		luz3.power = false;
		System.out.println(luz3);
	}
}
