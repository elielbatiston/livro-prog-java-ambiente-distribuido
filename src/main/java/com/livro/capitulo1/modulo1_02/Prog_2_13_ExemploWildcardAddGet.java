package com.livro.capitulo1.modulo1_02;

import java.util.ArrayList;
import java.util.List;

public class Prog_2_13_ExemploWildcardAddGet {
	public static void main(String[] args) {
		Prog_2_13_ExemploWildcardAddGet obj = new Prog_2_13_ExemploWildcardAddGet();
		List<String> l = new ArrayList<>();
		l.add("Douglas Mendes");
		l.add("Pedro Mendes");
		l.add("Davi Mendes");
		obj.manipListGenerica(l);		
	}
	
	/* Esse método apresenta que é possível usar o método get() para recuperar um elemento de uma
	 * coleção usando curinga, entretanto, não é possível adicionar um novo valor a uma coleção
	 * usando coringa
	 */
	void manipListGenerica(List<?> c) {
		System.out.println("Usando o método get():");
		for (int k = 0; k < c.size(); k++) {
			System.out.println(c.get(k));
		}
		// Gera erro de compilação, por isto esta linha deve ficar comentada
		// c.add("Flávio Mendes");
	}
}
