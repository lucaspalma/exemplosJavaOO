package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

/**
 * Modelo de conta de pessoa fisica. Você consegue sacar e depositar dinheir nesta conta. Qualquer problema ligue para (4432)99999-9999.
 * @author Lucas Takeshi
 * @version 1.0
 * @since 1.8
 *
 */
//extends Object
public abstract class Conta {

	private int numero;
	private String agencia;
	private double saldo;
	private String titular;
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + "]";
	}

//	@Override
//	public boolean equals(Object obj) { //Polimorfismo
//		try{
//			Conta contaComparar = (Conta) obj;
//			if(this.numero == contaComparar.getNumero() && this.agencia == contaComparar.getAgencia()) {
//				return true;
//			} else {
//				return false;
//			}
//		} catch(ClassCastException e) {
//			System.out.println("Cast deu ruim");
//			return false;
//		}
//	}
	
	public int getNumero() {
		return numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("Valor negativo inválido");
		}
		this.saldo += valor;
	}

	/**
	 * Recebe um valor e retira do saldo
	 * @param valor Valor do saque
	 * @throws IllegalArgumentException Não pode passar valor negativo
	 * @throws SaldoInsuficienteException Tem que ter saldo disponível para sacar
	 */
	public void sacar(double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("Valor negativo inválido");
		}
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException(this.saldo);
		}
	}
	
	public abstract String getTipo();
	
	
	
	
	
}
