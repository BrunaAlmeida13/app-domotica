package br.edu.infnet.appdomotica.model.domain;

public class Luz extends Aparelho {
	public String cor;
	public int intensidade;
	public int volumeSom;
	public boolean power;

	@Override
	public void impressao() {
		System.out.println("#Luz");
		System.out.println(this);
	}
	
	@Override
	public long quantidadeHorasAgendada() {
		long hours = 0;
		if (timerFim == null || timerInicio == null) {
			System.out.println("Função horario de funcionamento desligado");
		} else {
			hours = timerFim.getHour() - timerInicio.getHour();
			boolean tempoMaximo = hours >= 11;
				if(tempoMaximo) {
					power = false;
				}
		}
		return hours;
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

	@Override
	public String toString() {
		return "Luz [" + super.toString() + "Cor: " + this.cor + "; Intensidade: " + this.intensidade
				+ "; Volume do som: " + this.volumeSom + "; Power: " + this.power + "]\n";
	}

}
