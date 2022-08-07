package br.edu.infnet.model.domain;

public class Fechadura extends Aparelho {
	public String senha;
	public boolean trancada;
	public boolean alarme;

	@Override
	public String toString() {
		return "Fechadura [Senha: " + this.senha + "; Trancada: " + this.trancada + "; Alarme: " + this.alarme + "] ";
	}
}
