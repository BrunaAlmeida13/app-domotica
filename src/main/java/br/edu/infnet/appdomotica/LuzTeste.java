package br.edu.infnet.appdomotica;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.controller.LuzController;
import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.exceptions.VolumeSomInvalidoException;

@Component
public class LuzTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		Luz luz1 = new Luz();
		luz1.setNome("Luz quarto Nina");
		luz1.setStatus("Ligada");
		luz1.setTimerInicio(LocalDateTime.of(2022, 12, 25, 8, 30, 00));
		luz1.setTimerFim(LocalDateTime.of(2022, 12, 25, 19, 30, 00));
		luz1.setCor("azul");
		luz1.setIntensidade(2);
		luz1.setVolumeSom(50);
		luz1.setPower(true);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + luz1.quantidadeHorasAgendada());
			LuzController.incluir(luz1);
		} catch (VolumeSomInvalidoException e) {
			System.out.println("[ERROR - LUZ] " + e.getMessage() + "\n");
		}

		Luz luz2 = new Luz();
		luz2.setNome("Luz quarto suíte");
		luz2.setStatus("Ligada");
		luz2.setTimerInicio(null);
		luz2.setTimerFim(null);
		luz2.setCor("vermelho");
		luz2.setIntensidade(3);
		luz2.setVolumeSom(20);
		luz2.setPower(true);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + luz2.quantidadeHorasAgendada());
			LuzController.incluir(luz2);
		} catch (VolumeSomInvalidoException e) {
			System.out.println("[ERROR - LUZ] " + e.getMessage() + "\n");
		}

		Luz luz3 = new Luz();
		luz3.setNome("Luz Cozinha");
		luz3.setStatus("Desligada");
		luz3.setTimerInicio(null);
		luz3.setTimerFim(null);
		luz3.setCor("");
		luz3.setIntensidade(0);
		luz3.setVolumeSom(0);
		luz3.setPower(false);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + luz3.quantidadeHorasAgendada());
			LuzController.incluir(luz3);
		} catch (VolumeSomInvalidoException e) {
			System.out.println("[ERROR - LUZ] " + e.getMessage() + "\n");
		}
		
		Luz luz4 = new Luz();
		luz4.setNome("Luz Cozinha");
		luz4.setStatus("Desligada");
		luz4.setTimerInicio(null);
		luz4.setTimerFim(null);
		luz4.setCor("");
		luz4.setIntensidade(0);
		luz4.setVolumeSom(101);
		luz4.setPower(false);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + luz4.quantidadeHorasAgendada());
			LuzController.incluir(luz4);
		} catch (VolumeSomInvalidoException e) {
			System.out.println("[ERROR - LUZ] " + e.getMessage() + "\n");
		}
		
		Luz luz5 = new Luz();
		luz5.setNome("Luz Cozinha");
		luz5.setStatus("Desligada");
		luz5.setTimerInicio(null);
		luz5.setTimerFim(null);
		luz5.setCor("");
		luz5.setIntensidade(0);
		luz5.setVolumeSom(-1);
		luz5.setPower(false);
		try {
			System.out.println("Duração agendada do tempo de funcionamento: " + luz5.quantidadeHorasAgendada());
			LuzController.incluir(luz5);
		} catch (VolumeSomInvalidoException e) {
			System.out.println("[ERROR - LUZ] " + e.getMessage() + "\n");
		}
	}
}
