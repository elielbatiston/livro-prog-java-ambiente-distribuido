package com.livro.capitulo1.modulo1_01;

import java.util.ArrayList;
import java.util.List;

public class Prog_1_10_ExemploArrayList {

	public static void main(String[] args) {
		//Capacidade inicial igual a 200 elementos
		List<Integer> l = new ArrayList<Integer>(200);
		l.add(2008);
		l.add(27);
		l.add(9);
		l.add(1974);
		System.out.println(l);
		//O metodo size() retorna o tamanho do vetor
		System.out.println("Quantidade de elementos do vetor: " + l.size());
	}
}
