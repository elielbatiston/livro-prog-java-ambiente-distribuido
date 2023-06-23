package com.livro.capitulo1.modulo1_01;

public class Prog_1_28_ExemploPessoa {
	private String nome;
	private int rg;

	public Prog_1_28_ExemploPessoa() {
		super();
	}
	
	public Prog_1_28_ExemploPessoa(String nome, int rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}
	
	public String toString() {
		return "(" + rg + ", " + nome + ")";
	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getRg() {
		return rg;
	}

	
	public void setRg(int rg) {
		this.rg = rg;
	}	
}
