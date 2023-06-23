package com.livro.capitulo1.modulo1_01;

public class Prog_1_29_ExemploPessoaFisica extends Prog_1_28_ExemploPessoa {	
	private int cpf;

	public Prog_1_29_ExemploPessoaFisica() {
		super();
	}
	
	public Prog_1_29_ExemploPessoaFisica(String nome, int rg, int cpf) {
		super(nome, rg);
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}	
}
