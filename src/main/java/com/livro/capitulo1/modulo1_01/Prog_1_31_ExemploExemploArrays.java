package com.livro.capitulo1.modulo1_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Prog_1_31_ExemploExemploArrays {	
	public static void main(String[] args) {
		String[] a = new String[] {"a", "b", "c", "d", "e", "f", "g"};
		// Converte o array para um objeto do tipo List
		List<String> list = Arrays.asList(a);
		//Embaralha o vetor com o método shuffle()
		Collections.shuffle(list);
		// Cria um objeto para navegar entre os elementos da lista
		Iterator<String> i = list.iterator();
		System.out.println("\nImprimindo o vetor embaralhado depos de ser convertido em uma lista com o método asList().");;
		while (i.hasNext()) {
			System.out.println(" " + i.next());			
		}
		System.out.println("\nImprimindo o vetor ordenado com o método sort().");
		String[] b = new String[] {"J", "A", "C", "A", "R", "E", "O"};
		Arrays.sort(b);
		for (int j = 0; j < b.length; j++) {
			System.out.println(" " + b[j]);
		}
	}	
}
