package com.livro.capitulo1.modulo1_01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Prog_1_12_ExemploArrayListContaCorrente {

	public static void main(String[] args) {
		new Prog_1_12_ExemploArrayListContaCorrente().processar();
	}
	
	public void processar() {
		//Criando objeto c que representa um conjunto ordenado.
		List<Prog_1_08_ContaCorrenteComparable> c = new ArrayList<>();	
		Prog_1_08_ContaCorrenteComparable cc = null;
		cc = new Prog_1_08_ContaCorrenteComparable();
		cc.setAgencia(1996);
		cc.setConta(9765431);
		cc.setNome("Douglas Rocha Mendes");
		cc.setSaldo(1000.0);		
		c.add(cc);
		
		cc = new Prog_1_08_ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(1367931);
		cc.setNome("Carlos Iran Alves");
		cc.setSaldo(5500.0);
		c.add(cc);
		
		cc = new Prog_1_08_ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(7678431);
		cc.setNome("Lian Iwesen Antunes");
		cc.setSaldo(7500.0);
		c.add(cc);
		
		cc = new Prog_1_08_ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(1367931);
		cc.setNome("Carlos Iran Alves");
		cc.setSaldo(7500.0);
		c.add(cc);
		
		//Realizando a ordenação dos objetos
		Collections.sort(c);
		imprimir(c);
	}
	
	public void imprimir(Collection<Prog_1_08_ContaCorrenteComparable> set) {
		Iterator<Prog_1_08_ContaCorrenteComparable> it = set.iterator();
		System.out.println("Imprimindo um a um ordenados pelo número da conta.");
		NumberFormat formatarString, formatarValor;
		formatarString = new DecimalFormat("0000");
		formatarValor = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formatarValor.setMinimumFractionDigits(2);
		while(it.hasNext()) {
			Object val = it.next();
			System.out.println("******************************");
			System.out.println("Agência: \t" + 
				formatarString.format(((Prog_1_08_ContaCorrenteComparable) val).getAgencia()));
			System.out.println("Conta: \t\t" + 
				formatarString.format(((Prog_1_08_ContaCorrenteComparable) val).getConta()));
			System.out.println("Nome: \t\t" + ((Prog_1_08_ContaCorrenteComparable) val).getNome());
			System.out.println("Saldo: \t\t" + 
				formatarValor.format(((Prog_1_08_ContaCorrenteComparable) val).getSaldo()));
		}
	}
}
