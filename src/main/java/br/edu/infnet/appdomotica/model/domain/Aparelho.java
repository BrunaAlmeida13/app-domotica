package br.edu.infnet.appdomotica.model.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import br.edu.infnet.appdomotica.interfaces.IPrinter;
import br.edu.infnet.appdomotica.model.exceptions.TamanhoMaximoSenhaException;
import br.edu.infnet.appdomotica.model.exceptions.TemperaturaNaoPodeSerMuitoBaixa;
import br.edu.infnet.appdomotica.model.exceptions.VolumeSomInvalidoException;

public abstract class Aparelho implements IPrinter {
	private Integer id;
	private String nome;
	private String status;
	private LocalDateTime timerInicio = LocalDateTime.now();
	private LocalDateTime timerFim = LocalDateTime.now();

	public abstract long quantidadeHorasAgendada()
			throws VolumeSomInvalidoException, TamanhoMaximoSenhaException, TemperaturaNaoPodeSerMuitoBaixa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getTimerInicio() {
		return timerInicio;
	}

	public void setTimerInicio(LocalDateTime timerInicio) {
		this.timerInicio = timerInicio;
	}

	public LocalDateTime getTimerFim() {
		return timerFim;
	}

	public void setTimerFim(LocalDateTime timerFim) {
		this.timerFim = timerFim;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aparelho other = (Aparelho) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Status: " + this.status + ", Timer Inicio: " + this.timerInicio
				+ ", Timer Fim: " + this.timerFim + "; ";
	}
}
