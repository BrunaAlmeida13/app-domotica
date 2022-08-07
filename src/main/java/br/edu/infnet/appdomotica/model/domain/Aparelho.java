package br.edu.infnet.appdomotica.model.domain;

import java.time.LocalDateTime;

public class Aparelho {
	public String nome;
	public String status;
	public LocalDateTime timerInicio;
	public LocalDateTime timerFim;

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
	public String toString() {
		return "Nome: " + nome + ", Status: " + status + ", Timer Inicio: " + timerInicio + ", Timer Fim: "
				+ timerFim + "; ";
	}
}
