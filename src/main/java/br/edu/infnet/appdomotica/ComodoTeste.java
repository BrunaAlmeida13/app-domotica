package br.edu.infnet.appdomotica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		
		Luz luz3 = new Luz();
		luz3.setNome("Luz Cozinha");
		luz3.setStatus("Desligada");
		luz3.setTimerInicio(null);
		luz3.setTimerFim(null);
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

		ArCondicionado ac3 = new ArCondicionado();
		ac3.setNome("A.C. Cozinha");
		ac3.setStatus("Ligado");
		ac3.setTimerInicio(null);
		ac3.setTimerFim(null);
		ac3.setTemperatura(22.0);
		ac3.setVentilacao(true);
		ac3.setPower(true);	
		
		String dir = "C:\\Users\\bruna\\OneDrive\\Área de Trabalho\\EclipeEE_Workspace\\appdomotica\\src\\main\\webapp\\WEB-INF\\arquivos_txt\\";
		String arq = "comodos.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while(linha != null) {
					try {
						
						String[] campos = linha.split(";");
						
						Set<Aparelho> listaAparelhos1 = new HashSet<Aparelho>();
						listaAparelhos1.add(luz3);
						listaAparelhos1.add(ac3);
						listaAparelhos1.add(fechadura1);
						
						Responsavel resp1 = new Responsavel(campos[2], campos[3], campos[4], campos[5]);
						
						Comodo comodo1 = new Comodo(resp1, listaAparelhos1);
						comodo1.setTipo(campos[0]);
						comodo1.setNome(campos[1]);
						ComodoController.incluir(comodo1);
					} catch (CpfInvalidoException | ResponsavelNuloException | ComodoSemAparelhosException  e) {
						System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
					} 

					linha = leitura.readLine();
				}
				
				leitura.close();
				fileReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe!");
			} catch (IOException e) {
				System.out.println("[ERRO] Problema no fechamento do arquivo!");
			}
		} finally {
			System.out.println("Finalizado.");
		}
		
	}
}
