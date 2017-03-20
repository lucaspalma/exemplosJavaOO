package br.com.caelum.contas.modelo;

public class Diretor extends Gerente {

	@Override
	public double getBonificacao() {
		return super.getBonificacao() * 2;
	}
	
}
