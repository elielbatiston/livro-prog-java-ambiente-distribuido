package com.livro.capitulo1.modulo1_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prog_1_24_ExemploArraySort {		
	public static void main(String[] args) {
		String animals[] = new String[4];
		animals[0] = "pássaros";
		animals[1] = "baleia";
		animals[2] = "macacos";
		animals[3] = "cobra";
		System.out.println("Imprimindo o vetor de strings não ordenado");
		for (int i = 0; i < 4; i++) {
			System.out.println("animal " + i + " : " + animals[i]);
		}
		Arrays.sort(animals);
		System.out.println("Imprimindo o vetor de strings ordenado");
		for (int i = 0; i < 4; i++) {
			System.out.println("animal " + i + " : " + animals[i]);
		}
		List<String> l = new ArrayList<>();
		l.add(animals[0]);
		l.add(animals[1]);
		l.add(animals[2]);
		l.add(animals[3]);
		Collections.sort(l);
		System.out.println("Imprimindo a lista ordenado");
		for (int i = 0; i < l.size(); i++) {
			System.out.println("animal " + i + " : " + l.get(i));
		}
	}
}
