package br.edu.infnet.model.domain;

public class ArCondicionado extends Aparelho {
	public double temperatura;
	public boolean ventilacao;
	public boolean power;
	
	@Override
	public String toString() {
		return "A.C.[Temperatura: " + this.temperatura + "; Ventilacao: "
				+ this.ventilacao + "; Power: " + this.power + "] ";
	}
	
}
