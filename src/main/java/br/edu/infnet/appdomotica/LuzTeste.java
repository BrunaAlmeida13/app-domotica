package br.edu.infnet.appdomotica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.exceptions.VolumeSomInvalidoException;
import br.edu.infnet.appdomotica.model.service.LuzService;

@Component
public class LuzTeste implements ApplicationRunner {

	@Autowired
	private LuzService luzService;

	@Override
	public void run(ApplicationArguments args) {
		String dir = "C:\\Users\\bruna\\OneDrive\\Área de Trabalho\\EclipeEE_Workspace\\appdomotica\\src\\main\\webapp\\WEB-INF\\arquivos_txt\\";
		String arq = "aparelho.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);

				String linha = leitura.readLine();
				while (linha != null) {

					String[] campos = linha.split(";");

					if ("L".equalsIgnoreCase(campos[0])) {
						try {
							Luz luz1 = new Luz();
							luz1.setNome(campos[1]);
							luz1.setStatus(campos[2]);
							// TODO fazer conversão data e hora
							luz1.setTimerInicio(LocalDateTime.parse(campos[3], DateTimeFormatter.ISO_DATE_TIME));
							luz1.setTimerFim(LocalDateTime.parse(campos[4], DateTimeFormatter.ISO_DATE_TIME));
							luz1.setCor(campos[5]);
							luz1.setIntensidade(Integer.valueOf(campos[6]));
							luz1.setVolumeSom(Integer.valueOf(campos[7]));
							luz1.setPower(Boolean.valueOf(campos[8]));
							System.out.println(
									"Duração agendada do tempo de funcionamento: " + luz1.quantidadeHorasAgendada());
							luzService.incluir(luz1);
						} catch (VolumeSomInvalidoException e) {
							System.out.println("[ERROR - LUZ] " + e.getMessage() + "\n");
						}
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
