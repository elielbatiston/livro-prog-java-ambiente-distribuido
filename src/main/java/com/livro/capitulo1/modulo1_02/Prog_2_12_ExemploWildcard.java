package com.livro.capitulo1.modulo1_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Prog_2_12_ExemploWildcard {
	public static void main(String[] args) {
		Prog_2_12_ExemploWildcard obj = new Prog_2_12_ExemploWildcard();
		List<String> l = new ArrayList<>();
		l.add("Douglas Mendes");
		l.add("Pedro Mendes");
		l.add("Davi Mendes");
		obj.imprimirCollectionGenerica(l);
		obj.imprimirListGenerica(l);
	}
	
	void imprimirCollectionGenerica(Collection<?> c) {
		Iterator<?> i = c.iterator();
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}
	
	void imprimirListGenerica(List<?> c) {
		Iterator<?> i = c.iterator();
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}
}
