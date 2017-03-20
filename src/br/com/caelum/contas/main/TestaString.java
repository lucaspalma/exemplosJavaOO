package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

/**
 * Testes do pull de Strings do Java e da imutabilidade dos objetos do tipo String
 * @author Lucas Takeshi
 
 */
public class TestaString {

	public static void main(String[] args) {
		String nome = "Lucas Takeshi";
		String nome2 = "Lucas Takeshi";
		
		if (nome == nome2) { //Mesmas referências do pull de Strings
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setTitular("Lucas Takeshi");		
		if (nome == contaCorrente.getTitular()) { //Mesmas referências do pull de Strings
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		String outroNome = new String("Rafael Rollinho");
		String outroNome2 = new String("Rafael Rollinho");
		if (outroNome == outroNome2) { //Referências diferentes que não estão no pull de Strings
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		//String imutável
		nome.toUpperCase();
		System.out.println("nome: " + nome);
		
		String nomeComSobrenome = nome.toUpperCase();
		System.out.println("nome: " + nome); //Lucas Takeshi
		System.out.println("nomeComSobrenome: " + nomeComSobrenome); //LUCAS TAKESHI		
		
		nomeComSobrenome = nomeComSobrenome.concat(" PALMA");
		System.out.println("nomeComSobrenome: " + nomeComSobrenome); //LUCAS TAKESHI PALMA
		
		nomeComSobrenome = nomeComSobrenome.replace("PALMA", "RODRIGUES");
		System.out.println("nomeComSobrenome: " + nomeComSobrenome); //LUCAS TAKESHI RODRIGUES
		
		System.out.println(nomeComSobrenome.contains("LUC")); //true
		
		String texto = "                                    abcd     edf                           ";
		System.out.println("[" + texto.trim() + "]");
		System.out.println("[" + texto + "]");
		
		String textoVazio = "";
		System.out.println(textoVazio.length());
	}
	
}
