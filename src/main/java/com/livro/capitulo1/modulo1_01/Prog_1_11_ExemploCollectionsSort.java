package com.livro.capitulo1.modulo1_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog_1_11_ExemploCollectionsSort {

	public static void main(String[] args) {
		//Capacidade inicial igual a 200 elementos
		List<String> ordem = new ArrayList<String>();
		ordem.add("pássaros");
		ordem.add("baleia");
		ordem.add("macacos");
		ordem.add("cobra");
		System.out.println("Imprimindo não ordenado");
		for (int i = 0; i < 4; i++) {
			System.out.println("animal " + i + " : " + ordem.get(i));				
		}
		Collections.sort(ordem);
		System.out.println("\nImprimindo ordenado");
		for (int i = 0; i < 4; i++) {
			System.out.println("animal " + i + " : " + ordem.get(i));				
		}
	}
}
