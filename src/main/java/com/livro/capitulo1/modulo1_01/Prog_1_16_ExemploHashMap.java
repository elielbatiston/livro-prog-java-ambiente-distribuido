package com.livro.capitulo1.modulo1_01;

import java.util.HashMap;
import java.util.Map;

public class Prog_1_16_ExemploHashMap {

	public static void main(String[] args) throws InterruptedException {		
		Map<Integer,String> c = new HashMap<>();
		c.put(1, "Maria Antonieta");
		c.put(2, "Claudia Vanessa");
		c.put(3, "Ivete Soares");
		c.put(4, "Douglas Rocha Mendes");
		c.put(5, "Beatriz Klopp");
		c.put(6, "Pedro Mendes");
		/* Substituirá Maria Antonieta por Douglas Rocha Mendes. Maria Antonieta será eliminada da 
		 * coleção por possuir a mesma chave que Douglas Rocha Mendes
		 */
		c.put(1, "Douglas Rocha Mendes");
		System.out.println(c);
	}
}
