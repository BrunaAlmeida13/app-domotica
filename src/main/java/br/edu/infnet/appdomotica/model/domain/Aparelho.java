package br.edu.infnet.appdomotica.model.domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

import br.edu.infnet.appdomotica.interfaces.IPrinter;

public abstract class Aparelho implements IPrinter {
	public String nome;
	public String status;
	public LocalDateTime timerInicio = LocalDateTime.now();
	public LocalDateTime timerFim = LocalDateTime.now();
	
	public long quantidadeHorasAgendada() {
		// TODO resolver exception; terminar checklist; colocar como abstract
		//long hours = ChronoUnit.HOURS.between(timerInicio, timerFim);
		return 0;
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
		return "Nome: " + nome + ", Status: " + status + ", Timer Inicio: " + timerInicio + ", Timer Fim: "
				+ timerFim + "; " + "Duração agendada do tempo de funcionamento: " + this.quantidadeHorasAgendada() + "; ";
	}
}
