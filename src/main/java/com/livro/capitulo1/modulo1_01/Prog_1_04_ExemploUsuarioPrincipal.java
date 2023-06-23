package com.livro.capitulo1.modulo1_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prog_1_04_ExemploUsuarioPrincipal {

	public static void main(String[] args) {
		Set<Prog_1_03_ExemploUsuario> set = new HashSet<>();
		Prog_1_03_ExemploUsuario usu = null;
		
		usu = new Prog_1_03_ExemploUsuario(12042004, 27091974, "Doulgas");
		set.add(usu);
		
		usu = new Prog_1_03_ExemploUsuario(25081982, 101010, "Davi");
		set.add(usu);
		
		usu = new Prog_1_03_ExemploUsuario(20112009, 202020, "Pedro");
		set.add(usu);
		
		/* Não será adicionado ao conjunto, pois já existe um objeto com o mesmo CPF (202020) */
		usu = new Prog_1_03_ExemploUsuario(30303030, 202020, "Leticia");
		set.add(usu);
		
		Iterator<Prog_1_03_ExemploUsuario> it = set.iterator();
		System.out.println("Imprimindo cada objeto do conjunto");
		while(it.hasNext()) {
			Prog_1_03_ExemploUsuario val = it.next();
			System.out.println("*********************************");
			System.out.println("CPF: " + val.getCpf());
			System.out.println("RG: " + val.getRg());
			System.out.println("Nome: " + val.getNome());
		}
	}
}
