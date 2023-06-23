package com.livro.capitulo1.modulo1_01;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Prog_1_26_ExemploPessoaComparablePrincipalList {		
	public static void main(String[] args) {
		List<Prog_1_25_ExemploPessoaComparable> q = new LinkedList<>();
		q.add(new Prog_1_25_ExemploPessoaComparable("Rocha", 26985875));
		q.add(new Prog_1_25_ExemploPessoaComparable("Douglas", 85255985));
		q.add(new Prog_1_25_ExemploPessoaComparable("Pedro", 26985875));
		q.add(new Prog_1_25_ExemploPessoaComparable("Mendes", 567989058));
		q.add(new Prog_1_25_ExemploPessoaComparable("Davi", 1234258));
		q.add(new Prog_1_25_ExemploPessoaComparable("Cássio", 5566798));
		q.add(new Prog_1_25_ExemploPessoaComparable("Rúbio", 1234258));
		q.add(new Prog_1_25_ExemploPessoaComparable("Melissa", 26985875));
		Collections.sort(q);
		imprimir(q);
	}
	
	public static void imprimir(Collection<Prog_1_25_ExemploPessoaComparable> set) {
		Iterator<Prog_1_25_ExemploPessoaComparable> it = set.iterator();
		int cont = 1;
		System.out.println("Imprimindo um a um odenados pelo nome");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println(cont + " " + val);
			cont++;
		}
	}
}
