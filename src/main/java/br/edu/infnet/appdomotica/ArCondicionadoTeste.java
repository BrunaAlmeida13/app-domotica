package br.edu.infnet.appdomotica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		
		
		
		String dir = "C:\\Users\\bruna\\OneDrive\\Área de Trabalho\\EclipeEE_Workspace\\appdomotica\\src\\main\\webapp\\WEB-INF\\arquivos_txt\\";
		String arq = "arCondicionado.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while(linha != null) {
					try {
						
						String[] campos = linha.split(";");
						
						ArCondicionado ac1 = new ArCondicionado();
						ac1.setNome(campos[0]);
						ac1.setStatus(campos[1]);
						ac1.setTimerInicio(LocalDateTime.parse(campos[2]));
						ac1.setTimerFim(LocalDateTime.parse(campos[3]));
						ac1.setTemperatura(Double.valueOf(campos[4]));
						ac1.setVentilacao(Boolean.valueOf(campos[5]));
						ac1.setPower(Boolean.valueOf(campos[6]));
						
						System.out.println("Duração agendada do tempo de funcionamento: " + ac1.quantidadeHorasAgendada());
						ArCondicionadoController.incluir(ac1);
					} catch (TemperaturaNaoPodeSerMuitoBaixa e) {
						System.out.println("[ERROR - A.C] " + e.getMessage() + "\n");
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
