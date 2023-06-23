package com.livro.capitulo1.modulo1_01;

import java.util.Vector;

public class Prog_1_13_ExemploVector {

	public static void main(String[] args) {
		//Capacidade inicial igual a 2 objetos
		Vector<Integer> l = new Vector<>(2);
		System.out.println("Capacidade inicial do vetor: " + l.capacity());
		l.add(27);
		l.add(9);
		l.add(1974);
		System.out.println("Capacidade após a 3ª adição: " + l.capacity());
		l.add(2008);
		l.add(12);
		System.out.println("Capacidade após a 5ª adição: " + l.capacity());
		l.add(4);
		l.add(2004);
		l.add(25);
		System.out.println("Capacidade após a 8ª adição: " + l.capacity());
		l.add(12);
		l.add(2008);
		System.out.println("Capacidade após a 10ª adição: " + l.capacity());
		l.add(1);
		l.add(8);
		System.out.println("Capacidade após a 12ª adição: " + l.capacity());
		System.out.println("Elementos: " + l);
		//Quantidade de elementos do vetor
		System.out.println("Quantidade de elementos do vetor: " + l.size());
		
	}
}
