package com.livro.capitulo1.modulo1_01;

public class Prog_1_08_ContaCorrenteComparable implements Comparable<Prog_1_08_ContaCorrenteComparable> {

    private int conta;
    private int agencia;
    private Double saldo;
    private String nome;
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Prog_1_08_ContaCorrenteComparable outraConta) {
		int outroValor = outraConta.getConta();
		if (this.getConta() > outroValor) {
			return 1;
		} else {
			if (this.getConta() < outroValor) {
				return -1;
			}
		}		
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + conta;
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
		Prog_1_08_ContaCorrenteComparable other = (Prog_1_08_ContaCorrenteComparable) obj;
		if (conta != other.conta) {
			return false;
		}
		return true;
	}
}
