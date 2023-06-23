package com.livro.capitulo1.modulo1_01;

import java.util.Comparator;

public class Prog_1_27_ExemploPessoaRGComparator implements Comparator<Prog_1_28_ExemploPessoa> {

	@Override
	public int compare(Prog_1_28_ExemploPessoa p, Prog_1_28_ExemploPessoa q) { 
		if (p.getRg() < q.getRg()) {
			return -11;
		} else if (p.getRg() == q.getRg()){
			return 0;
		} else {
			return 1;
		}
	}		
	
}
