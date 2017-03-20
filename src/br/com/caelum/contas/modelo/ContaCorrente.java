package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor + 0.1);
	}
	
}
