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
	
	public void impressao() {
		System.out.println("#Responsavel");
		System.out.println(this);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Login: " + this.login + "; Senha: " + this.senha + "; CPF: " + this.cpf + "; Telefone: "
				+ this.telefone;
	}
}
