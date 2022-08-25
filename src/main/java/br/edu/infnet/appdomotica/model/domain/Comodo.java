package br.edu.infnet.appdomotica.model.domain;

import java.util.Set;

import br.edu.infnet.appdomotica.interfaces.IPrinter;
import br.edu.infnet.appdomotica.model.exceptions.ComodoSemAparelhosException;
import br.edu.infnet.appdomotica.model.exceptions.ResponsavelNuloException;

public class Comodo implements IPrinter {
	private Integer id;
	private String tipo;
	private String nome;
	private Set<Aparelho> listaAparelhos;
	private Responsavel responsavel;

	public Comodo(Responsavel responsavel, Set<Aparelho> listaAparelhos) throws ResponsavelNuloException, ComodoSemAparelhosException {
		
		if(responsavel == null) {
			throw new ResponsavelNuloException("Não tem como controlar os aparelhos de um cômodo sem um responsável.");
		}
		
		if(listaAparelhos == null) {
			throw new ComodoSemAparelhosException("Não tem como controlar um cômodo sem uma listagem de aparelhos.");
		}
		
		if(listaAparelhos.size() < 1) {
			throw new ComodoSemAparelhosException("Não tem como controlar um cômodo sem aparelhos.");
		}
		
		this.responsavel = responsavel;
		this.listaAparelhos = listaAparelhos;
	}

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
	
	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Tipo: " + this.tipo + "; Nome: " + this.nome + "; \nResponsavel: " + responsavel
				+ "; \nNúmero de aparelhos no cômodo: " + listaAparelhos.size() + "\n";
		// listaAparelhos.toString()
	}
}
