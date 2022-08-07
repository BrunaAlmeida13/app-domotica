package br.edu.infnet.appdomotica.model.domain;

public class Responsavel {
	public String login;
	public String senha;
	public String cpf;
	public String telefone;
	
	public Responsavel(String login, String senha, String cpf, String telefone) {
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Login: " + this.login + "; Senha: " + this.senha + "; CPF: " + this.cpf + "; Telefone: " + this.telefone;
	}
}
