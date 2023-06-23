package com.livro.capitulo1.modulo1_01;

public class Prog_1_25_ExemploPessoaComparable implements Comparable<Prog_1_25_ExemploPessoaComparable>{		
	private String nome;
	private int rg;
	
	public Prog_1_25_ExemploPessoaComparable(String nome, int rg) {
		super();
		this.nome = nome;
		this.rg = rg;
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

	@Override
	public String toString() {
		return "(" + rg + ", " + nome + ")";
	}

	/* O valor retornado pelo método comparteTo() deve ser:
	 * menor (<) que zero se o receptor é menor do que o parâmetro,
	 * igual (=) a 0 se o receptor é o parâmetro forem iguais.
	 * maior (>) que 0 caso contrário.
	 */
	@Override
	public int compareTo(Prog_1_25_ExemploPessoaComparable outraPessoa) {
		String outraString = outraPessoa.getNome();
		// Precisamos utilizar o método compareTo(), devido a compararmos strings
		if ((this.getNome().compareTo(outraString)) > 0) {
			return 1;
		} else {
			if ((this.getNome().compareTo(outraString)) < 0) {
				return -1;
			}
		}
		return 0;
	}
	
	/* Exemplo de como ordenar pelo RG. O método está comentado para não gerar erro de compilação. O
	 * método anterior tem a mesma assinatura. Para optar entre um e outro remover o comentário deste
	 * e colocar no método anterior.
	 */
	/*@Override
	public int compareTo(Prog_1_25_ExemploPessoaComparable outraPessoa) {
		int outroRg = outraPessoa.getRg();
		// Precisamos utilizar o método compareTo(), devido a compararmos strings
		if (this.getRg() > outroRg) {
			return 1;
		} else {
			if (this.getRg() < outroRg) {
				return -1;
			}
		}
		return 0;
	}*/
}
