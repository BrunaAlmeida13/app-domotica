package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.Fechadura;

@Component
public class FechaduraTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#fechadura");
		
		Fechadura fechadura1 = new Fechadura();
		fechadura1.nome = "Fechadura sala";
		fechadura1.status = "Ligada";
		fechadura1.timerInicio = null;
		fechadura1.timerFim = null;
		fechadura1.senha = "8745";
		fechadura1.trancada = true;
		fechadura1.alarme = true;
		System.out.println(fechadura1);		
		
		Fechadura fechadura2 = new Fechadura();
		fechadura2.nome = "Fechadura cozinha";
		fechadura2.status = "Destrancada";
		fechadura2.timerInicio = null;
		fechadura2.timerFim = null;
		fechadura2.senha = "6489";
		fechadura2.trancada = false;
		fechadura2.alarme = false;
		System.out.println(fechadura1);	
		
		Fechadura fechadura3 = new Fechadura();
		fechadura3.nome = "Fechadura portão garagem";
		fechadura3.status = "Trancada";
		fechadura3.timerInicio = null;
		fechadura3.timerFim = null;
		fechadura3.senha = "4215";
		fechadura3.trancada = true;
		fechadura3.alarme = false;
		System.out.println(fechadura3);
	}
}
