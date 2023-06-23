package com.livro.capitulo1.modulo1_01;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Prog_1_30_ExemploPessoaFisicaComparatorPrincipalList {	
	public static void main(String[] args) {
		List<Prog_1_28_ExemploPessoa> q = new LinkedList<>();		
		q.add(new Prog_1_29_ExemploPessoaFisica("Douglas", 85255985, 123));
		q.add(new Prog_1_28_ExemploPessoa("Rocha", 26985875));
		q.add(new Prog_1_29_ExemploPessoaFisica("Pedro", 12345545, 112));
		q.add(new Prog_1_28_ExemploPessoa("Mendes", 58963258));
		q.add(new Prog_1_28_ExemploPessoa("Neves", 58963258));		
		Collections.sort(q, new Prog_1_27_ExemploPessoaRGComparator());
		imprimir(q);
	}
	
	public static void imprimir(Collection<Prog_1_28_ExemploPessoa> set) {
		Iterator<Prog_1_28_ExemploPessoa> it = set.iterator();
		int cont = 1;
		System.out.println("Imprimindo um a um odenados pelo RG");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println(cont + " " + val);
			cont++;
		}
	}	
}
