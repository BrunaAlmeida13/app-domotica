package br.edu.infnet.model.domain;

public class Responsavel {
	public String login;
	public String senha;
	public String cpf;
	public String telefone;
	
	@Override
	public String toString() {
		return "Login: " + this.login + "; Senha: " + this.senha + "; CPF: " + this.cpf + "; Telefone: " + this.telefone;
	}
}
