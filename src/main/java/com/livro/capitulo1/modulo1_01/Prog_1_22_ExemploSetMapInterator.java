package com.livro.capitulo1.modulo1_01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prog_1_22_ExemploSetMapInterator {		
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("C++");
        set.add("Smalltalk");
        //Por ser repetido não será inserido no conjunto
        set.add("Java");
        set.add("Delphi");
        set.add("PHP");
        //Imprimir todos os objetos do conjunto. A impressão ocorrerá sem ordem.
        System.out.println("Imprimir todos os objetos de uma única vez: " + set);
        /* Para recuperar os objetos de um conjunto individualmente devemos utilizar um iterator. */
        imprimirSet(set);    
        Map<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "Java");
        mapa.put(2, "C++");
        mapa.put(3, "Smalltalk");
        mapa.put(4, "Java");
        mapa.put(5, "Delphi");
        mapa.put(6, "PHP");
        //Imprimir todos os objetos do mapa. A impressão ocorrerá sem ordem.
        System.out.println("Imprimir todos os objetos do mapa: " + mapa);
        //Imprime cada elemento do conjunto
        imprimirMap(mapa);
	}
	
	public static void imprimirSet(Set<String> set) {
		Iterator<String> it = set.iterator();
		imprimir(it);
	}
	
	public static void imprimirMap(Map<Integer, String> mapa) {
		Iterator<Map.Entry<Integer, String>> it = mapa.entrySet().iterator();
		imprimir(it);
	}
	
	public static void imprimir(Iterator<?> it) {
		int cont = 1;
		System.out.println("***************");
		System.out.println("Imprimindo um a um:");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println(cont + " -  " + val);
			cont++;
		}
	}
}
