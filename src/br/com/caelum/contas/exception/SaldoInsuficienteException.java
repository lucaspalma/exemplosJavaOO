package br.com.caelum.contas.exception;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(double saldo) {
		super("Saldo insuficiente. Saldo atual: " + saldo);
	}

}
