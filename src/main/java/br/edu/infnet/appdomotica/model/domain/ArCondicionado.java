package br.edu.infnet.appdomotica.model.domain;

public class ArCondicionado extends Aparelho {
	public double temperatura;
	public boolean ventilacao;
	public boolean power;

	@Override
	public void impressao() {
		System.out.println("#ArCondicionado");
		System.out.println(this);
	}

	@Override
	public long quantidadeHorasAgendada() {
		long hours = 1;
		if (getTimerFim() == null || getTimerInicio() == null) {
			System.out.println("Função horario de funcionamento para no mínimo 1h");
		} else {
			hours = getTimerFim().getHour() - getTimerInicio().getHour();
		}
		return hours;
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

	@Override
	public String toString() {
		return "A.C.[" + super.toString() + "Temperatura: " + this.temperatura + "; Ventilacao: " + this.ventilacao
				+ "; Power: " + this.power + "]\n";
	}
}
