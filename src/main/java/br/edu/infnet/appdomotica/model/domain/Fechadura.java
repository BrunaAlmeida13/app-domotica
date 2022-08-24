package br.edu.infnet.appdomotica.model.domain;

public class Fechadura extends Aparelho {
	public String senha;
	public boolean trancada;
	public boolean alarme;

	@Override
	public void impressao() {
		System.out.println("#Fechadura");
		System.out.println(this);
	}

	@Override
	public long quantidadeHorasAgendada() {
		long hours = 0;
		if (getTimerFim() == null || getTimerInicio() == null) {
			System.out.println("Função horario de funcionamento desligado");
		} else {
			hours = getTimerFim().getHour() - getTimerInicio().getHour();
		}
		return hours;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isTrancada() {
		return trancada;
	}

	public void setTrancada(boolean trancada) {
		this.trancada = trancada;
	}

	public boolean isAlarme() {
		return alarme;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}

	@Override
	public String toString() {
		return "Fechadura [" + super.toString() + "Senha: " + this.senha + "; Trancada: " + this.trancada + "; Alarme: "
				+ this.alarme + "]\n";
	}
}
