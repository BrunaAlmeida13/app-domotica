package br.edu.infnet.appdomotica.model.domain;

public class ArCondicionado extends Aparelho {
	private Integer id;
	public double temperatura;
	public boolean ventilacao;
	public boolean power;

	@Override
	public void impressao() {
		System.out.println("#ArCondicionado");
		System.out.println(this);
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public boolean isVentilacao() {
		return ventilacao;
	}

	public void setVentilacao(boolean ventilacao) {
		this.ventilacao = ventilacao;
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
		return "A.C.[" + super.toString() + "Temperatura: " + this.temperatura + "; Ventilacao: " + this.ventilacao
				+ "; Power: " + this.power + "]\n";
	}
}
