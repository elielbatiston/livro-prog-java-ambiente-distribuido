package com.livro.capitulo1.modulo1_01;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Prog_1_23_ExemploListIterator {		
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();
		l.add(27);
		l.add(9);
		l.add(1974);
		l.add(2008);
		ListIterator<Integer> lit = l.listIterator();
		//Método hasNext(), questiona se existe um objeto posterior
		while (lit.hasNext()) {
			System.out.println(lit.nextIndex() + " - " + lit.next());
		}
		System.out.println("\nAnálise Decrescente: ");
		// Método hasPrevious(), question se existe um objeto anterior
		while (lit.hasPrevious()) {
			System.out.println(lit.previousIndex() + " - " + lit.previous());
		}
	}
}
