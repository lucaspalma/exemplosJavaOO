package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

/**
 * Classe de teste para os métodos toString e equals herdados de Object 
 * e também testes para o Cast de tipos referências
 * @author Lucas Takeshi
 * 
 */
public class TestaJava {

	public static void main(String[] args) {
		String nome = "Lucas";
		System.out.println(nome);
		int numero = 100;
		System.out.println(numero);
		
		Conta minhaConta = new ContaCorrente(); //Polimorfismo
		minhaConta.setNumero(100);
		minhaConta.setAgencia("10-0");
		minhaConta.setTitular("Lucas Takeshi");
		System.out.println(minhaConta); //chama o método toString()
		
		Conta outraConta = new ContaCorrente(); //Polimorfismo
		outraConta.setNumero(100);
		outraConta.setAgencia("10-0");
		outraConta.setTitular("Lucas Takeshi");
		
		if(minhaConta == outraConta) { //Compara referências
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		if(minhaConta.equals(outraConta)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		
		Object objeto = new ContaCorrente();
		
		Conta c = (Conta) objeto;
		c.setNumero(100);
		System.out.println(objeto);

		ContaCorrente cc = (ContaCorrente) objeto;
		System.out.println(cc);
		
//		As duas próximas linhas dão CastException
//		ContaInvestimento ci = (ContaInvestimento) objeto;
//		String func = (String) objeto;
		
		
//		Exemplo de if ternário
//		boolean ? true : false;
		System.out.println(minhaConta.equals(outraConta) ? "iguais" : "diferentes");
	}
	
}
