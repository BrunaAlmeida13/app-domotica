package br.edu.infnet.appdomotica.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Comodo {
	public String tipo;
	public String nome;
	
	Luz luz = new Luz();
	ArCondicionado ac = new ArCondicionado();
	
	public List<Aparelho> listaAparelhos = new ArrayList<Aparelho>();
	
	@Override
	public String toString() {	
		return "Tipo: " + this.tipo + "; Nome: " + this.nome 
				+ "; \nLista de aparelhos no cômodo: " + listaAparelhos.toString();
	}
}
