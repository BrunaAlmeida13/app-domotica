package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.controller.FechaduraController;
import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.exceptions.TamanhoMaximoSenhaException;

@Component
public class FechaduraTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) {
		
		Fechadura fechadura1 = new Fechadura();
		fechadura1.setNome("Fechadura sala");
		fechadura1.setStatus("Trancada");
		fechadura1.setTimerInicio(null);
		fechadura1.setTimerFim(null);
		fechadura1.setSenha("8745");
		fechadura1.setTrancada(true);
		fechadura1.setAlarme(true);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + fechadura1.quantidadeHorasAgendada());
			FechaduraController.incluir(fechadura1);
		} catch (TamanhoMaximoSenhaException e) {
			System.out.println("[ERROR - FECHADURA] " + e.getMessage() + "\n");
		}
		
		
		Fechadura fechadura2 = new Fechadura();
		fechadura2.setNome("Fechadura cozinha");
		fechadura2.setStatus("Destrancada");
		fechadura2.setTimerInicio(null);
		fechadura2.setTimerFim(null);
		fechadura2.setSenha("6489");
		fechadura2.setTrancada(false);
		fechadura2.setAlarme(false);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + fechadura2.quantidadeHorasAgendada());
			FechaduraController.incluir(fechadura2);
		} catch (TamanhoMaximoSenhaException e) {
			System.out.println("[ERROR - FECHADURA] " + e.getMessage() + "\n");
		}
		
		Fechadura fechadura3 = new Fechadura();
		fechadura3.setNome("Fechadura portão garagem");
		fechadura3.setStatus("Trancada");
		fechadura3.setTimerInicio(null);
		fechadura3.setTimerFim(null);
		fechadura3.setSenha("4215");
		fechadura3.setTrancada(true);
		fechadura3.setAlarme(false);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + fechadura3.quantidadeHorasAgendada());
			FechaduraController.incluir(fechadura3);
		} catch (TamanhoMaximoSenhaException e) {
			System.out.println("[ERROR - FECHADURA] " + e.getMessage() + "\n");
		}	
	
		Fechadura fechadura4 = new Fechadura();
		fechadura4.setNome("Fechadura portão garagem");
		fechadura4.setStatus("Trancada");
		fechadura4.setTimerInicio(null);
		fechadura4.setTimerFim(null);
		fechadura4.setSenha("42155");
		fechadura4.setTrancada(true);
		fechadura4.setAlarme(false);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + fechadura4.quantidadeHorasAgendada());
			FechaduraController.incluir(fechadura4);
		} catch (TamanhoMaximoSenhaException e) {
			System.out.println("[ERROR - FECHADURA] " + e.getMessage() + "\n");
		}	
	}
}
