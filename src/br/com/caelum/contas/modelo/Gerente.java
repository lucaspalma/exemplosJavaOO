package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {

	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 1.5;
	}

}
