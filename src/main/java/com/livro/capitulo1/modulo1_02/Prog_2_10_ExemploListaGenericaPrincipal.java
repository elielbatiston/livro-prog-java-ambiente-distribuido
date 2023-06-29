package com.livro.capitulo1.modulo1_02;

import java.util.LinkedList;

public class Prog_2_10_ExemploListaGenericaPrincipal {
	public static void main(String[] args) {
		new Prog_2_10_ExemploListaGenericaPrincipal().processar();
	}	
	
	private void processar() {
		Prog_2_09_ExemploListaGenerica<String> obj = new Prog_2_09_ExemploListaGenerica<>();
		montarListaStrings(obj);
		// Executa o método genérico, passando uma string.
		if (obj.verificarConteudo("Livro de Java")) {
			System.out.println("A String pesquisada esta contida na lista");
		} else {
			System.out.println("String não encontrada.");
		}
		Prog_2_09_ExemploListaGenerica<Integer> obj1 = new Prog_2_09_ExemploListaGenerica<>();
		montarListaInteger(obj1);
		// Executa o método genérico, passando um inteiro
		if (obj1.verificarConteudo(27091974)) {
			System.out.println("O Integer pesquisado esta contido na lista");
		} else {
			System.out.println("Número não encontrado.");
		}
		System.out.println("");
	}
	
	private void montarListaInteger(Prog_2_09_ExemploListaGenerica<Integer> obj) {
		obj.add(27091974);
		obj.add(12042004);
		obj.add(20112009);
	}
	
	private void montarListaStrings(Prog_2_09_ExemploListaGenerica<String> obj) {
		obj.add("Programação Java com Ênfase em Orientação a Objetos");
		obj.add("Redes de Computadores - Teoria e Prática");
		obj.add("Programação Java com Ênfase em Cliente Servidor");
		obj.add("Desde a Analise ao Codigo");
		obj.add("Design OO");
	}
}
