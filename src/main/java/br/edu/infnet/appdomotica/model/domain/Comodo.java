package br.edu.infnet.appdomotica.model.domain;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appdomotica.interfaces.IPrinter;

public class Comodo implements IPrinter {
	private String tipo;
	private String nome;
	private List<Aparelho> listaAparelhos = new ArrayList<Aparelho>();

	@Override
	public void impressao() {
		System.out.println("#Fechadura");
		System.out.println(this);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aparelho> getListaAparelhos() {
		return listaAparelhos;
	}

	@Override
	public String toString() {
		return "Tipo: " + this.tipo + "; Nome: " + this.nome + "; \nLista de aparelhos no cômodo: "
				+ listaAparelhos.toString();
	}
}
