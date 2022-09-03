package br.edu.infnet.appdomotica.model.domain;

import br.edu.infnet.appdomotica.interfaces.IPrinter;
import br.edu.infnet.appdomotica.model.exceptions.CpfInvalidoException;

public class Morador implements IPrinter {

	private String nome;
	private String email;
	private String senha;

	@Override
	public void impressao() {
		System.out.println("#Morador");
		System.out.println(this);
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public String toString() {
		return "Nome: " + this.nome + "; E-mail: " + this.email + "; Senha: " + this.senha;
	}
}
