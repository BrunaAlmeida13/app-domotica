package br.edu.infnet.appdomotica.model.domain;

import br.edu.infnet.appdomotica.model.exceptions.VolumeSomInvalidoException;

public class Luz extends Aparelho {
	private String cor;
	private int intensidade;
	private int volumeSom;
	private boolean power;

	@Override
	public void impressao() {
		System.out.println("#Luz");
		System.out.println(this);
	}
	
	@Override
	public long quantidadeHorasAgendada() throws VolumeSomInvalidoException {
		
		if(this.getVolumeSom() < 0 || this.getVolumeSom() > 100) {
			throw new VolumeSomInvalidoException("Volume: " + this.getVolumeSom() + ". O volume não pode ser menor que 0 ou maior que 100!");
		}
		
		long hours = 0;
		if (getTimerFim() == null || getTimerInicio() == null) {
			System.out.println("Função horario de funcionamento desligado");
		} else {
			hours = getTimerFim().getHour() - getTimerInicio().getHour();
			boolean tempoMaximo = hours >= 11;
				if(tempoMaximo) {
					this.power = false;
					this.volumeSom = 0;
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
