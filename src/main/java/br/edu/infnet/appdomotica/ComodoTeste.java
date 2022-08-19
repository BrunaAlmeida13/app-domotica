package br.edu.infnet.appdomotica;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.domain.Comodo;
import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.domain.Responsavel;
import br.edu.infnet.appdomotica.model.test.AppImpressao;

@Component
public class ComodoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Luz luz = new Luz();
		Fechadura fechadura = new Fechadura();
		ArCondicionado ac = new ArCondicionado();

		Luz luz1 = new Luz();
		luz1.setNome("Luz quarto Nina");
		luz1.setStatus("Ligado");
		luz1.setTimerInicio(null);
		luz1.setTimerFim(null);
		luz1.setCor("azul");
		luz1.setIntensidade(2);
		luz1.setVolumeSom(50);
		luz1.setPower(true);
		
		Fechadura fechadura1 = new Fechadura();
		fechadura1.setNome("Fechadura sala");
		fechadura1.setStatus("Trancada");
		fechadura1.setTimerInicio(null);
		fechadura1.setTimerFim(null);
		fechadura1.setSenha("8745");
		fechadura1.setTrancada(true);
		fechadura1.setAlarme(true);
		
		ArCondicionado ac1 = new ArCondicionado();
		ac1.setNome("A.C. quarto suíte");
		ac1.setStatus("Ligado");
		ac1.setTimerInicio(LocalDateTime.of(2022, 12, 25, 8, 30, 00));
		ac1.setTimerFim(LocalDateTime.of(2022, 12, 25, 18, 30, 00));
		ac1.setTemperatura(22.0);
		ac1.setVentilacao(true);
		ac1.setPower(true);

		Responsavel resp1 = new Responsavel("responsavel1@email.com", "usu1", "658487891269", "61456987263"); 
		Comodo comodo1 = new Comodo(resp1);
		comodo1.getListaAparelhos().add(luz1);
		comodo1.getListaAparelhos().add(ac1);
		comodo1.setTipo("Quarto");
		comodo1.setNome("Quarto da Nina");
		AppImpressao.relatorio("Configuração do 'Quarto da Nina'", comodo1); 
		
		Responsavel resp2 = new Responsavel("responsavel2@email.com", "usu2", "658484578969", "61547548263");
		Comodo comodo2 = new Comodo(resp2);
		comodo2.getListaAparelhos().add(luz1);
		comodo2.getListaAparelhos().add(ac1);
		comodo2.setTipo("Quarto");
		comodo2.setNome("Quarto Suíte");
		AppImpressao.relatorio("Configuração da 'Quarto Suíte'", comodo2); 
		
		Responsavel resp3 = new Responsavel("responsavel3@email.com", "usu3", "658487565869", "61548467963");
		Comodo comodo3 = new Comodo(resp3);
		comodo3.getListaAparelhos().add(luz1);
		comodo3.getListaAparelhos().add(ac1);
		comodo3.getListaAparelhos().add(fechadura1);
		comodo3.setTipo("Cozinha");
		comodo3.setNome("Cozinha");
		AppImpressao.relatorio("Configuração da 'Cozinha'", comodo3); 
	}
}
