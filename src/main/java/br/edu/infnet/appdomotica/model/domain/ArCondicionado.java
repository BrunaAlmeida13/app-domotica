package br.edu.infnet.appdomotica.model.domain;

public class ArCondicionado extends Aparelho {
	public double temperatura;
	public boolean ventilacao;
	public boolean power;

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
	
	@Override
	public String toString() {
		return "A.C.[" + super.toString() + "Temperatura: " + this.temperatura + "; Ventilacao: "
				+ this.ventilacao + "; Power: " + this.power + "] ";
	}
}
