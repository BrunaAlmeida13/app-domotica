package br.edu.infnet.model.domain;

public class Luz extends Aparelho {
	public String cor;
	public int intensidade;
	public int volumeSom;
	public boolean power;
	
	@Override
	public String toString() {
		return "Luz [Cor: " + this.cor + "; Intensidade: " + this.intensidade + "; Volume do som: " 
				+ this.volumeSom + "; Power: " + this.power + "] ";
	}
}
