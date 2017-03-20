package br.com.caelum.contas.modelo;

public abstract class Funcionario {

	private String nome;
	protected double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double getBonificacao();
	
}
