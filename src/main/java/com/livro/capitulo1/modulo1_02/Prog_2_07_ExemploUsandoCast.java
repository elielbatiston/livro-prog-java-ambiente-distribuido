package com.livro.capitulo1.modulo1_02;

import java.util.ArrayList;
import java.util.List;

import com.livro.capitulo1.modulo1_01.Prog_1_28_ExemploPessoa;

public class Prog_2_07_ExemploUsandoCast {
	public static void main(String[] args) {
		Prog_2_07_ExemploUsandoCast uc = new Prog_2_07_ExemploUsandoCast();
		uc.executarComGen();
		uc.executarSemGen();
	}
	
	private void executarComGen() {
		Prog_1_28_ExemploPessoa obj = null;
		List<Prog_1_28_ExemploPessoa> meuVetorGen = new ArrayList<Prog_1_28_ExemploPessoa>();
		obj = new Prog_1_28_ExemploPessoa("Douglas Rocha Mendes", 1234);
		meuVetorGen.add(obj);
		obj = new Prog_1_28_ExemploPessoa("Vanessa Martins", 34567);
		meuVetorGen.add(obj);
		/* Torna-se DESnecessário o uso de cast quando usamos o método get */
		System.out.println("**********************");
		System.out.println("Não usando o cast");
		System.out.println("Nome: " + (meuVetorGen.get(0)).getNome());
		System.out.println("Rg: " + (meuVetorGen.get(0)).getRg());
		System.out.println("Nome: " + (meuVetorGen.get(1)).getNome());
		System.out.println("Rg: " + (meuVetorGen.get(1)).getRg());
	}
	
	private void executarSemGen() {
		Prog_1_28_ExemploPessoa obj = null;
		List meuVetorGen = new ArrayList();
		obj = new Prog_1_28_ExemploPessoa("Pedro Rocha Mendes", 4567);
		meuVetorGen.add(obj);
		obj = new Prog_1_28_ExemploPessoa("Gleibe Zanetti", 8907);
		meuVetorGen.add(obj);
		System.out.println("******************************");
		System.out.println("Usando o cast - Tipo 01");
		/* Torna-se necessário o uso de cast (ExemploPessoa) quando usamos o método get(). Aqui
		 * estamos em uma única linha recuperando os atributos
		 */
		System.out.println("Nome: " + ((Prog_1_28_ExemploPessoa) (meuVetorGen.get(0))).getNome());
		System.out.println("Rg: " + ((Prog_1_28_ExemploPessoa) (meuVetorGen.get(0))).getRg());
		System.out.println("Nome: " + ((Prog_1_28_ExemploPessoa) (meuVetorGen.get(1))).getNome());
		System.out.println("Rg: " + ((Prog_1_28_ExemploPessoa) (meuVetorGen.get(1))).getRg());
		/* Podemos também acessar os elementos do vetor desta segunda forma:
		 * Aqui estamos recuperando um valor utilizado um método mais simples. Utilizamos duas linhas 
		 * para tal. Porém, o resultado é o mesmo
		 */
		System.out.println("Usando o cast - Tipo 02");
		obj = (Prog_1_28_ExemploPessoa) meuVetorGen.get(0);
		System.out.println("Nome: " + obj.getNome());
		System.out.println("Rg: " + obj.getRg());
		obj = (Prog_1_28_ExemploPessoa) meuVetorGen.get(1);
		System.out.println("Nome: " + obj.getNome());
		System.out.println("Rg: " + obj.getRg());
	}
}
