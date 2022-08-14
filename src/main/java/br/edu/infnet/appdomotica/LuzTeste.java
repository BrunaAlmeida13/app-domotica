package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.test.AppAparelho;

@Component
public class LuzTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Luz luz1 = new Luz();
		luz1.setNome("Luz quarto Nina");
		luz1.setStatus("Ligado");
		luz1.setTimerInicio(null); 
		luz1.setTimerFim(null);
		luz1.setCor("azul");
		luz1.setIntensidade(2);
		luz1.setVolumeSom(50);
		luz1.setPower(true);
		new AppAparelho("Configuração da 'Luz quarto Nina'").relatorio(luz1); 
		
		Luz luz2 = new Luz();
		luz2.setNome("Luz quarto suíte");
		luz2.setStatus("Ligada");
		luz2.setTimerInicio(null);
		luz2.setTimerFim(null);
		luz2.setCor("vermelho");
		luz2.setIntensidade(3);
		luz2.setVolumeSom(20);
		luz2.setPower(true);
		new AppAparelho("Configuração da 'Luz quarto suíte'").relatorio(luz2); 
		
		Luz luz3 = new Luz();
		luz3.setNome("Luz Cozinha");
		luz2.setStatus("Desligada");
		luz2.setTimerInicio(null);
		luz2.setTimerFim(null);
		luz3.setCor("");
		luz3.setIntensidade(0);
		luz3.setVolumeSom(0);
		luz3.setPower(false);
		new AppAparelho("Configuração da 'Luz Cozinha'").relatorio(luz3);
	}
}
