package br.edu.infnet.appdomotica;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.controller.ArCondicionadoController;
import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.exceptions.TemperaturaNaoPodeSerMuitoBaixa;

@Component
public class ArCondicionadoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		
		ArCondicionado ac1 = new ArCondicionado();
		ac1.setNome("A.C. quarto suíte");
		ac1.setStatus("Ligado");
		ac1.setTimerInicio(LocalDateTime.of(2022, 12, 25, 8, 30, 00));
		ac1.setTimerFim(LocalDateTime.of(2022, 12, 25, 18, 30, 00));
		ac1.setTemperatura(22.0);
		ac1.setVentilacao(true);
		ac1.setPower(true);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + ac1.quantidadeHorasAgendada());
			ArCondicionadoController.incluir(ac1);
		} catch (TemperaturaNaoPodeSerMuitoBaixa e) {
			System.out.println("[ERROR - A.C] " + e.getMessage() + "\n");
		}
		
		ArCondicionado ac2 = new ArCondicionado();
		ac2.setNome("A.C. quarto Nina");
		ac2.setStatus("Ligado");
		ac2.setTimerInicio(null);
		ac2.setTimerFim(null);
		ac2.setTemperatura(20.0);
		ac2.setVentilacao(false);
		ac2.setPower(true);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + ac2.quantidadeHorasAgendada());
			ArCondicionadoController.incluir(ac2);
		} catch (TemperaturaNaoPodeSerMuitoBaixa e) {
			System.out.println("[ERROR - A.C] " + e.getMessage() + "\n");
		} 
		
		ArCondicionado ac3 = new ArCondicionado();
		ac3.setNome("A.C. Sala");
		ac3.setStatus("Ligado");
		ac3.setTimerInicio(null);
		ac3.setTimerFim(null);
		ac3.setTemperatura(22.0);
		ac3.setVentilacao(true);
		ac3.setPower(true);	
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + ac3.quantidadeHorasAgendada());
			ArCondicionadoController.incluir(ac3);
		} catch (TemperaturaNaoPodeSerMuitoBaixa e) {
			System.out.println("[ERROR - A.C] " + e.getMessage() + "\n");
		} 
		
		ArCondicionado ac4 = new ArCondicionado();
		ac4.setNome("A.C. Sala");
		ac4.setStatus("Ligado");
		ac4.setTimerInicio(null);
		ac4.setTimerFim(null);
		ac4.setTemperatura(9.0);
		ac4.setVentilacao(true);
		ac4.setPower(true);	
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + ac4.quantidadeHorasAgendada());
			ArCondicionadoController.incluir(ac4);
		} catch (TemperaturaNaoPodeSerMuitoBaixa e) {
			System.out.println("[ERROR - A.C] " + e.getMessage() + "\n");
		} 
	}
}
