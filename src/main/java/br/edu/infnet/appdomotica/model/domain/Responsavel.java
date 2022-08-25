package br.edu.infnet.appdomotica.model.domain;

import br.edu.infnet.appdomotica.interfaces.IPrinter;
import br.edu.infnet.appdomotica.model.exceptions.CpfInvalidoException;

public class Responsavel implements IPrinter {
	private Integer id;
	private String login;
	private String senha;
	private String cpf;
	private String telefone;

	public Responsavel(String login, String senha, String cpf, String telefone) throws CpfInvalidoException {
		if(cpf == null) throw new CpfInvalidoException("Não é possível aceitar CPF nulo.");
		if(cpf.isEmpty()) throw new CpfInvalidoException("Não é póssível aceitar CPF sem preenchimento");
		this.cpf = cpf; 
		this.login = login;
		this.senha = senha;
		this.telefone = telefone;
	}

	@Override
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Login: " + this.login + "; Senha: " + this.senha + "; CPF: " + this.cpf + "; Telefone: "
				+ this.telefone;
	}

}
