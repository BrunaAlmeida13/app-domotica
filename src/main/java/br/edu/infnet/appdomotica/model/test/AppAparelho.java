package br.edu.infnet.appdomotica.model.test;

import br.edu.infnet.appdomotica.model.domain.Aparelho;

public class AppAparelho {

	private String mensagem;
	
	public AppAparelho(String mensagem) {
		this.mensagem = mensagem;
	}

	public void relatorio(Aparelho aparelho) {
		System.out.println(mensagem);

		aparelho.impressao();
	}

}
