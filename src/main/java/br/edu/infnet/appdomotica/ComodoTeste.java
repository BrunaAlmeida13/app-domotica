package br.edu.infnet.appdomotica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdomotica.model.domain.Aparelho;
import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.domain.Comodo;
import br.edu.infnet.appdomotica.model.domain.Fechadura;
import br.edu.infnet.appdomotica.model.domain.Luz;
import br.edu.infnet.appdomotica.model.domain.Responsavel;
import br.edu.infnet.appdomotica.model.exceptions.ComodoSemAparelhosException;
import br.edu.infnet.appdomotica.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appdomotica.model.exceptions.ResponsavelNuloException;
import br.edu.infnet.appdomotica.model.exceptions.TamanhoMaximoSenhaException;
import br.edu.infnet.appdomotica.model.exceptions.VolumeSomInvalidoException;
import br.edu.infnet.appdomotica.model.service.ComodoService;

@Component
public class ComodoTeste implements ApplicationRunner {

	@Autowired
	private ComodoService comodoService;

	@Override
	public void run(ApplicationArguments args) {

		String dir = "C:\\Users\\bruna\\OneDrive\\Área de Trabalho\\EclipeEE_Workspace\\appdomotica\\src\\main\\webapp\\WEB-INF\\arquivos_txt\\";
		String arq = "comodos.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);

				Set<Aparelho> listaAparelhos = null;
				List<Comodo> comodos = new ArrayList<Comodo>();

				String linha = leitura.readLine();
				while (linha != null) {

					String[] campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					case "C":
						try {
							listaAparelhos = new HashSet<Aparelho>();

							Responsavel responsavel = new Responsavel(campos[3], campos[4], campos[5], campos[6]);

							Comodo comodo = new Comodo(responsavel, listaAparelhos);
							comodo.setTipo(campos[1]);
							comodo.setNome(campos[2]);
							comodos.add(comodo);
						} catch (CpfInvalidoException | ResponsavelNuloException | ComodoSemAparelhosException e) {
							System.out.println("[ERROR - COMODO] " + (e.getMessage() + "\n"));
						}
						break;

					case "L":
						Luz luz = new Luz();
						luz.setNome(campos[1]);
						luz.setStatus(campos[2]);
						// TODO fazer conversão data e hora - front-end
						luz.setTimerInicio(LocalDateTime.parse(campos[3], DateTimeFormatter.ISO_DATE_TIME));
						luz.setTimerFim(LocalDateTime.parse(campos[4], DateTimeFormatter.ISO_DATE_TIME));
						luz.setCor(campos[5]);
						luz.setIntensidade(Integer.valueOf(campos[6]));
						luz.setVolumeSom(Integer.valueOf(campos[7]));
						luz.setPower(Boolean.valueOf(campos[8]));

						listaAparelhos.add(luz);
						break;

					case "F":
						Fechadura fechadura = new Fechadura();
						fechadura.setNome(campos[1]);
						fechadura.setStatus(campos[2]);
						fechadura.setTimerInicio(LocalDateTime.parse(campos[3]));
						fechadura.setTimerFim(LocalDateTime.parse(campos[4]));
						fechadura.setSenha(campos[5]);
						fechadura.setTrancada(Boolean.valueOf(campos[6]));
						fechadura.setAlarme(Boolean.valueOf(campos[7]));

						listaAparelhos.add(fechadura);
						break;

					case "A":
						ArCondicionado ac = new ArCondicionado();
						ac.setNome(campos[1]);
						ac.setStatus(campos[2]);
						ac.setTimerInicio(LocalDateTime.parse(campos[3]));
						ac.setTimerFim(LocalDateTime.parse(campos[4]));
						ac.setTemperatura(Double.valueOf(campos[5]));
						ac.setVentilacao(Boolean.valueOf(campos[6]));
						ac.setPower(Boolean.valueOf(campos[7]));

						listaAparelhos.add(ac);
						break;
					}

					linha = leitura.readLine();
				}

				for (Comodo c : comodos) {
					comodoService.incluir(c);
					
					System.out.println("ID > " + c.getId());
					System.out.println("Responsável > " + c.getResponsavel());
					System.out.println("Quantidade de comodos > " + c.getListaAparelhos().size() + "\n");
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
