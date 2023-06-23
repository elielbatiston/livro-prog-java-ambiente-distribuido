package com.livro.capitulo1.modulo1_01;

import java.util.Stack;

public class Prog_1_14_ExemploStack {

	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<Integer>(); //Classe pilha
		// Alimenta a pilha com números inteiros
		for (int i = 0; i < 10; i++) {
			System.out.println("Inserindo na pilha: " + pilha.push(i));
		}
		// Retira da pilha
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.println("Retirando da pilha: " + pilha.pop());
		}
	}
}
