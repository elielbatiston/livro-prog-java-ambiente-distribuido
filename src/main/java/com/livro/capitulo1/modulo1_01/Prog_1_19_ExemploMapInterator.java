package com.livro.capitulo1.modulo1_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Prog_1_19_ExemploMapInterator {

	public static void main(String[] args) throws InterruptedException {		
		Map<Integer,String> mapa = new HashMap<>();
		mapa.put(11, "Douglas Mendes");
		mapa.put(12, "Márcio Fagner");
		mapa.put(3, "Atalíbio Neves");
		mapa.put(4, "Rodrigo Vieira");
		// Usando um iterator para acessar as chaves do mapa
		Iterator<Integer> chaves;
		// O método keySet().interator retorna um iterador para todas as chaves.
		chaves = mapa.keySet().iterator(); 
		System.out.println("******************************");
		System.out.println("Primeira situação: Acesso as chaves do mapa usando interator.");
		while (chaves.hasNext()) {
			System.out.println("Chave: " + chaves.next());
		}
		chaves = mapa.keySet().iterator();
		System.out.println("******************************");
		System.out.println("Segunda situação: Acesso aos objetos do mapa usando o método get() e a chave obtida pelo interator.");
		while (chaves.hasNext()) {
			/* A partir de uma chave obtida pelo interador, retornamo o objeto associado. */
			System.out.println("Objeto: " + mapa.get(chaves.next()));
		}
		/* O método values().iterator() retorna um iterador para acessar o conteúdo do mapa. */
		Iterator<String> conteudo;
		conteudo = mapa.values().iterator();
		System.out.println("******************************");
		System.out.println("Terceira situação: Acesso aos objetos do mapa sem o uso do métogo get().");
		while (conteudo.hasNext()) {
			System.out.println("Objeto: " + conteudo.next());
		}
		// Usando um iterator para acessar a chave e o conteúdo juntos.
		Iterator<Map.Entry<Integer, String>> chavesElemEntry;
		chavesElemEntry = mapa.entrySet().iterator();
		System.out.println("******************************");
		System.out.println("Quarta situação: Acesso aos objetos e chaves ao mesmo tempo.");
		while (chavesElemEntry.hasNext()) {
			System.out.println("Chave+Elemento Entry: " + chavesElemEntry.next());
		}
	}
}
