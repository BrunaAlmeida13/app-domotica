package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.test.AppAparelho;

@Component
public class FechaduraTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Fechadura fechadura1 = new Fechadura();
		fechadura1.setNome("Fechadura sala");
		fechadura1.setStatus("Trancada");
		fechadura1.setTimerInicio(null);
		fechadura1.setTimerFim(null);
		fechadura1.setSenha("8745");
		fechadura1.setTrancada(true);
		fechadura1.setAlarme(true);
		new AppAparelho("Configuração da 'Fechadura sala'").relatorio(fechadura1); 
		
		Fechadura fechadura2 = new Fechadura();
		fechadura2.setNome("Fechadura cozinha");
		fechadura2.setStatus("Destrancada");
		fechadura2.setTimerInicio(null);
		fechadura2.setTimerFim(null);
		fechadura2.setSenha("6489");
		fechadura2.setTrancada(false);
		fechadura2.setAlarme(false);
		new AppAparelho("Configuração da 'Fechadura cozinha'").relatorio(fechadura2); 
		
		Fechadura fechadura3 = new Fechadura();
		fechadura3.setNome("Fechadura portão garagem");
		fechadura3.setStatus("Trancada");
		fechadura3.setTimerInicio(null);
		fechadura3.setTimerFim(null);
		fechadura3.setSenha("4215");
		fechadura3.setTrancada(true);
		fechadura3.setAlarme(false);
		new AppAparelho("Configuração da 'Fechadura portão garagem'").relatorio(fechadura3); 
	}
}
