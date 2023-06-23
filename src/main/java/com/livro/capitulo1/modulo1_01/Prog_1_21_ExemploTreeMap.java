package com.livro.capitulo1.modulo1_01;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Prog_1_21_ExemploTreeMap {
	private HashMap<Integer, String> hashMap;
	private SortedMap<Integer, String> treeMap;
	
	public void executar() {
		hashMap = new HashMap<Integer, String>();
		hashMap.put(500, "Jair Pereira");
		hashMap.put(20, "Douglas Mendes");
		hashMap.put(1, "Benfato Pires");
		hashMap.put(150, "Olavo Antunes");
		// Ordena o hashMap usando um objeto treeMap
		treeMap = new TreeMap<Integer, String>(hashMap);		
	}
	
	public static void main(String[] args) {
		Prog_1_21_ExemploTreeMap map = new Prog_1_21_ExemploTreeMap();
		map.executar();
		System.out.println("Imprimindo elementos sem ordenação");
		System.out.println("HashMap: " + map.hashMap);
		System.out.println("Imprimindo elementos com ordenação");
		System.out.println("TreeMap: " + map.treeMap);
	}
	
}
