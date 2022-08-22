package br.edu.infnet.appdomotica.model.domain;

public class Luz extends Aparelho {
	private Integer id;
	public String cor;
	public int intensidade;
	public int volumeSom;
	public boolean power;

	@Override
	public void impressao() {
		System.out.println("#Luz");
		System.out.println(this);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(int intensidade) {
		this.intensidade = intensidade;
	}

	public int getVolumeSom() {
		return volumeSom;
	}

	public void setVolumeSom(int volumeSom) {
		this.volumeSom = volumeSom;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Luz [" + super.toString() + "Cor: " + this.cor + "; Intensidade: " + this.intensidade
				+ "; Volume do som: " + this.volumeSom + "; Power: " + this.power + "]\n";
	}

}
