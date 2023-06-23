package com.livro.capitulo1.modulo1_01;

import java.util.LinkedList;
import java.util.Queue;

public class Prog_1_15_ExemploQueue {

	public static void main(String[] args) throws InterruptedException {		
		Queue<Integer> queue = new LinkedList<Integer>(); //Classe pilha
		for (int i = 0; i < 10; i++) {
			System.out.println("Adicionand o elemento: " + i + " na fila");
			queue.add(i);
		}
		System.out.println();
		while(!queue.isEmpty()) {
			System.out.println("Removendo o elemento: " + queue.remove() + " da fila");
			// Gera um delay de 1 segundo para mostrar os dados de forma mais lenta
			Thread.sleep(1000);
		}
	}
}
