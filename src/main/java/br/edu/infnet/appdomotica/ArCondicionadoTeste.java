package br.edu.infnet.appdomotica;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.ArCondicionado;

@Component
public class ArCondicionadoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#ArCondicionado");
		
		ArCondicionado ac1 = new ArCondicionado();
		ac1.setNome("A.C. quarto suíte");
		ac1.setStatus("Ligado");
		ac1.setTimerInicio(null);
		ac1.setTimerFim(null);
		ac1.setTemperatura(22.0);
		ac1.setVentilacao(true);
		ac1.setPower(true);
		System.out.println(ac1);
		
		ArCondicionado ac2 = new ArCondicionado();
		ac2.setNome("A.C. quarto Nina");
		ac2.setStatus("Ligado");
		ac2.setTimerInicio(null);
		ac2.setTimerFim(null);
		ac2.setTemperatura(22.0);
		ac2.setVentilacao(false);
		ac2.setPower(true);
		System.out.println(ac2);
		
		ArCondicionado ac3 = new ArCondicionado();
		ac3.setNome("A.C. Sala");
		ac3.setStatus("Ligado");
		ac3.setTimerInicio(null);
		ac3.setTimerFim(null);
		ac3.setTemperatura(22.0);
		ac3.setVentilacao(false);
		ac3.setPower(true);
		System.out.println(ac3);	
	}
}
