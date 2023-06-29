package com.livro.capitulo1.modulo1_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog_2_11_ExemploSubTiposGenericos {
	public static void main(String[] args) {
		Prog_2_11_ExemploSubTiposGenericos obj = new Prog_2_11_ExemploSubTiposGenericos();
		List<String> l = new ArrayList<>();
		l.add("Douglas Mendes");
		l.add("Pedro Mendes");
		l.add("Davi Mendes");
		/* Esta próxima linha apresenta um erro de compilação devido a assinatura do método
		 * imprimirCollectionGenericaErro esperar um objeto do tipo Object e não um objeto do 
		 * tipo String
		 */
		//obj.imprimirCollectionGenericaErro(l);
		/* Estamlinha não gera erro, devido ao método imprimirCollectionGenericaOK()
		 * ter a mesma assinatura que o tipo passado como parâmetro
		 */
		obj.imprimirCollectionGenericaOK(l);
		obj.imprimirCollectionGenericaCuringa(l);
	}
	
	void imprimirCollectionGenericaErro(List<Object> c) {
		Iterator<Object> i = c.iterator();
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}
	
	void imprimirCollectionGenericaOK(List<String> c) {
		Iterator<String> i = c.iterator();
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}
	
	void imprimirCollectionGenericaCuringa(List<?> c) {
		Iterator<?> i = c.iterator();
		System.out.println("\nUsando o curinga");
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}
}
