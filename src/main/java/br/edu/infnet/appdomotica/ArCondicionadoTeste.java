package br.edu.infnet.appdomotica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.exceptions.TemperaturaNaoPodeSerMuitoBaixa;
import br.edu.infnet.appdomotica.model.service.ArCondicionadoService;

@Component
@Order(5)
public class ArCondicionadoTeste implements ApplicationRunner {

	@Autowired
	private ArCondicionadoService arCondicionadoService;

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

					if ("A".equalsIgnoreCase(campos[0])) {
						try {
							ArCondicionado ac1 = new ArCondicionado();
							ac1.setNome(campos[1]);
							ac1.setStatus(campos[2]);
							ac1.timerInicioConversao(campos[3]);
							ac1.timerFimConversao(campos[4]);
							ac1.setTemperatura(Double.valueOf(campos[5]));
							ac1.setVentilacao(Boolean.valueOf(campos[6]));
							ac1.setPower(Boolean.valueOf(campos[7]));

							System.out.println(
									"Duração agendada do tempo de funcionamento: " + ac1.quantidadeHorasAgendada());
							arCondicionadoService.incluir(ac1);
						} catch (TemperaturaNaoPodeSerMuitoBaixa e) {
							System.out.println("[ERROR - A.C] " + e.getMessage() + "\n");
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
