package com.livro.capitulo1.modulo1_01;

import java.util.LinkedHashMap;
import java.util.Map;

public class Prog_1_18_ExemploLinkedHashMap {

	public static void main(String[] args) throws InterruptedException {		
		Map<Integer,Integer> mapa = new LinkedHashMap<>();
		mapa.put(11, 27);
		mapa.put(12, 9);
		mapa.put(3, 1974);
		mapa.put(4, 2008);
		
		System.out.println(mapa);
		System.out.println("*****************************");
		System.out.println("Acesso aos elementos do mapa usando a chave e o método get().");
		// 11 significa a chave utilizada na inserção
		System.out.println("Primeiro elemento do mapa: " + mapa.get(11));
		System.out.println("Segundo elemento do mapa: " + mapa.get(12));
		System.out.println("Tamanho do mapa: " + mapa.size());
	}
}
