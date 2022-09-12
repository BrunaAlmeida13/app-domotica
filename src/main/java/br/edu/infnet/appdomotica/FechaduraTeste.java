package br.edu.infnet.appdomotica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.exceptions.TamanhoMaximoSenhaException;
import br.edu.infnet.appdomotica.model.service.FechaduraService;

@Component
public class FechaduraTeste implements ApplicationRunner {
	
	@Autowired
	private FechaduraService fechaduraService;
	
	@Override
	public void run(ApplicationArguments args) {
		
		String dir = "C:\\Users\\bruna\\OneDrive\\Área de Trabalho\\EclipeEE_Workspace\\appdomotica\\src\\main\\webapp\\WEB-INF\\arquivos_txt\\";
		String arq = "fechadura.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while(linha != null) {

					String[] campos = linha.split(";");
					
					Fechadura fechadura1 = new Fechadura();
					fechadura1.setNome(campos[0]);
					fechadura1.setStatus(campos[1]);
					fechadura1.setTimerInicio(LocalDateTime.parse(campos[2]));
					fechadura1.setTimerFim(LocalDateTime.parse(campos[3]));
					fechadura1.setSenha(campos[4]);
					fechadura1.setTrancada(Boolean.valueOf(campos[5]));
					fechadura1.setAlarme(Boolean.valueOf(campos[6]));
					
					try {
						System.out.println("Duração agendada do tempo de funcionamento: " + fechadura1.quantidadeHorasAgendada());
						fechaduraService.incluir(fechadura1);
					} catch (TamanhoMaximoSenhaException e) {
						System.out.println("[ERROR - FECHADURA] " + e.getMessage() + "\n");
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
