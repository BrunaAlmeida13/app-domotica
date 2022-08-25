package br.edu.infnet.appdomotica;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.controller.ComodoController;
import br.edu.infnet.appdomotica.model.domain.Aparelho;
import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.domain.Comodo;
import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.domain.Responsavel;
import br.edu.infnet.appdomotica.model.exceptions.ComodoSemAparelhosException;
import br.edu.infnet.appdomotica.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appdomotica.model.exceptions.ResponsavelNuloException;

@Component
public class ComodoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		Luz luz1 = new Luz();
		luz1.setNome("Luz quarto Nina");
		luz1.setStatus("Ligado");
		luz1.setTimerInicio(null);
		luz1.setTimerFim(null);
		luz1.setCor("azul");
		luz1.setIntensidade(2);
		luz1.setVolumeSom(50);
		luz1.setPower(true);
		
		Luz luz2 = new Luz();
		luz2.setNome("Luz quarto suíte");
		luz2.setStatus("Ligada");
		luz2.setTimerInicio(null);
		luz2.setTimerFim(null);
		luz2.setCor("vermelho");
		luz2.setIntensidade(3);
		luz2.setVolumeSom(20);
		luz2.setPower(true);
		
		Luz luz3 = new Luz();
		luz3.setNome("Luz Cozinha");
		luz2.setStatus("Desligada");
		luz2.setTimerInicio(null);
		luz2.setTimerFim(null);
		luz3.setCor("");
		luz3.setIntensidade(0);
		luz3.setVolumeSom(0);
		luz3.setPower(false);
		
		Fechadura fechadura1 = new Fechadura();
		fechadura1.setNome("Fechadura cozinha");
		fechadura1.setStatus("Trancada");
		fechadura1.setTimerInicio(null);
		fechadura1.setTimerFim(null);
		fechadura1.setSenha("8745");
		fechadura1.setTrancada(true);
		fechadura1.setAlarme(true);
		
		ArCondicionado ac1 = new ArCondicionado();
		ac1.setNome("A.C. quarto Nina");
		ac1.setStatus("Ligado");
		ac1.setTimerInicio(LocalDateTime.of(2022, 12, 25, 8, 30, 00));
		ac1.setTimerFim(LocalDateTime.of(2022, 12, 25, 18, 30, 00));
		ac1.setTemperatura(22.0);
		ac1.setVentilacao(true);
		ac1.setPower(true);
		
		ArCondicionado ac2 = new ArCondicionado();
		ac2.setNome("A.C. quarto suíte");
		ac2.setStatus("Ligado");
		ac2.setTimerInicio(null);
		ac2.setTimerFim(null);
		ac2.setTemperatura(20.0);
		ac2.setVentilacao(false);
		ac2.setPower(true);

		ArCondicionado ac3 = new ArCondicionado();
		ac3.setNome("A.C. Cozinha");
		ac3.setStatus("Ligado");
		ac3.setTimerInicio(null);
		ac3.setTimerFim(null);
		ac3.setTemperatura(22.0);
		ac3.setVentilacao(true);
		ac3.setPower(true);	
		
		//Erro ao colocar 3 exceptions em um mesmo catch
		
		try {
			Set<Aparelho> listaAparelhos1 = new HashSet<Aparelho>();
			listaAparelhos1.add(luz1);
			listaAparelhos1.add(ac1);
			
			Responsavel resp1 = new Responsavel("responsavel1@email.com", "usu1", "658487891269", "61456987263");
			
			Comodo comodo1 = new Comodo(resp1, listaAparelhos1);
			comodo1.setTipo("Quarto");
			comodo1.setNome("Quarto da Nina");
			ComodoController.incluir(comodo1);
		}  catch (CpfInvalidoException | ResponsavelNuloException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		} catch (ComodoSemAparelhosException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		}
		
		try {
			Set<Aparelho> listaAparelhos2 = new HashSet<Aparelho>();
			listaAparelhos2.add(luz2);
			listaAparelhos2.add(ac2);
			
			Responsavel resp2 = new Responsavel("responsavel2@email.com", "usu2", "658484578969", "61547548263");
			
			Comodo comodo2 = new Comodo(resp2, listaAparelhos2);
			comodo2.setTipo("Quarto");
			comodo2.setNome("Quarto Suíte");
			ComodoController.incluir(comodo2);
		} catch (CpfInvalidoException | ResponsavelNuloException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		} catch (ComodoSemAparelhosException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		}
		
		try {
			Set<Aparelho> listaAparelhos3 = new HashSet<Aparelho>();
			listaAparelhos3.add(luz3);
			listaAparelhos3.add(ac3);
			listaAparelhos3.add(fechadura1);
			
			Responsavel resp3 = new Responsavel("responsavel3@email.com", "usu3", "658487565869", "61548467963");
			
			Comodo comodo3 = new Comodo(resp3, listaAparelhos3);
			comodo3.setTipo("Cozinha");
			comodo3.setNome("Cozinha");
			ComodoController.incluir(comodo3);
		} catch (CpfInvalidoException | ResponsavelNuloException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		} catch (ComodoSemAparelhosException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		}
		
		try {
			Set<Aparelho> listaAparelhos4 = new HashSet<Aparelho>();
			listaAparelhos4.add(luz3);
			listaAparelhos4.add(ac3);
			listaAparelhos4.add(fechadura1);
			
			Responsavel resp4 = new Responsavel("responsavel3@email.com", "usu3", "658487565869", "61548467963");
			
			Comodo comodo4 = new Comodo(null, listaAparelhos4);
			comodo4.setTipo("Sala");
			comodo4.setNome("Sala");
			ComodoController.incluir(comodo4);
		} catch (CpfInvalidoException | ResponsavelNuloException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		} catch (ComodoSemAparelhosException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		}
		
		try {
			Set<Aparelho> listaAparelhos5 = new HashSet<Aparelho>();
//			listaAparelhos5.add(luz3);
//			listaAparelhos5.add(ac3);
//			listaAparelhos5.add(fechadura1);
			
			Responsavel resp5 = new Responsavel("responsavel3@email.com", "usu3", "658487565869", "61548467963");
			
			Comodo comodo5 = new Comodo(resp5, listaAparelhos5);
			comodo5.setTipo("Garagem");
			comodo5.setNome("Garagem");
			ComodoController.incluir(comodo5);
		} catch (CpfInvalidoException | ResponsavelNuloException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		} catch (ComodoSemAparelhosException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		}
		
		try {
			Set<Aparelho> listaAparelhos6 = null;
			
			Responsavel resp6 = new Responsavel("responsavel3@email.com", "usu3", "658487565869", "61548467963");
			
			Comodo comodo6 = new Comodo(resp6, listaAparelhos6);
			comodo6.setTipo("Garagem 2");
			comodo6.setNome("Garagem 2");
			ComodoController.incluir(comodo6);
		} catch (CpfInvalidoException | ResponsavelNuloException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		} catch (ComodoSemAparelhosException e) {
			System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
		}
	}
}
