package com.livro.capitulo1.modulo1_02;

import java.util.LinkedList;

public class Prog_2_09_ExemploListaGenerica<E> extends LinkedList<E> implements Prog_2_08_InterfaceGenerica<E> {
	private static final long serialVersionUID = 1L;

	@Override
	public boolean verificarConteudo(E objetoRequerido) {
		/* O método contains foi utilizado devido a classe ExemploListaGenerica ser uma subclasse
		 * de LinkedList
		 */
		return (contains(objetoRequerido));
	}
	
}
