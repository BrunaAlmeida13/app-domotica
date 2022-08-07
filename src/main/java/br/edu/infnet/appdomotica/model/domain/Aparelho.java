package br.edu.infnet.appdomotica.model.domain;

import java.time.LocalDateTime;

public class Aparelho {
	public String nome;
	public String status;
	public LocalDateTime timerInicio;
	public LocalDateTime timerFim;
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Status: " + status + ", Timer Inicio: " + timerInicio + ", Timer Fim: "
				+ timerFim + "; ";
	}
	
	
}
