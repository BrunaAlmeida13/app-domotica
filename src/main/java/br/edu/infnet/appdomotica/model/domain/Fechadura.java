package br.edu.infnet.appdomotica.model.domain;

public class Fechadura extends Aparelho {
	public String senha;
	public boolean trancada;
	public boolean alarme;

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
				+ this.alarme + "] ";
	}
}
