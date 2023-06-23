package com.livro.capitulo1.modulo1_01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;

public class Prog_1_09_ExemploTreeSetContaCorrente {

	public static void main(String[] args) {
		new Prog_1_09_ExemploTreeSetContaCorrente().processar();
	}
	
	public void processar() {
		//Criando objeto c que representa um conjunto ordenado.
		SortedSet<Prog_1_08_ContaCorrenteComparable> c = new TreeSet<>();
		/* Criando uma referência chamada cc para a classe ContaCorrenteComparable. Se o novo objeto
		 * criado tiver um valor de conta igual a um objeto já existente no conjunto, esse objeto não
		 * será inserido. Isto é garantido pelos método equals() e hashCode() 
		 */
		Prog_1_08_ContaCorrenteComparable cc = null;
		cc = new Prog_1_08_ContaCorrenteComparable();
		cc.setAgencia(1996);
		cc.setConta(9765431);
		cc.setNome("Pedro Mendes");
		cc.setSaldo(1000.0);
		/* Ao adicionar o objeto o método compareTo() será executado e seu retorno definirá a posição 
		 * que o novo objeto será inserido
		 */
		c.add(cc);
		cc = new Prog_1_08_ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(1367931);
		cc.setNome("Alvaro de Araujo Junior");
		cc.setSaldo(5500.0);
		c.add(cc);
		
		cc = new Prog_1_08_ContaCorrenteComparable();
		cc.setAgencia(0003);
		cc.setConta(7678431);
		cc.setNome("Celso Norbertho");
		cc.setSaldo(7500.0);
		c.add(cc);
		imprimir(c);
	}
	
	public void imprimir(Collection<Prog_1_08_ContaCorrenteComparable> set) {
		Iterator<Prog_1_08_ContaCorrenteComparable> it = set.iterator();
		System.out.println("Imprimindo um a um ordenados pela conta.");
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
