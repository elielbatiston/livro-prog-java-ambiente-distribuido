package com.livro.capitulo1.modulo1_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prog_1_17_ExemploHashMap01 {

	public static void main(String[] args) throws InterruptedException {		
		Map<String,String> relacao = new HashMap<>();
		relacao.put("www.novatec.com.br", "13.154.72.41");
		relacao.put("www.intel.com", "43.10.23.62");
		relacao.put("www.spei.br", "50.63.113.26");
		relacao.put("www.mundooo.com.br", "52.122.11.42");
		relacao.put("java.sun.com", "92.128.17.27");
		relacao.put("www.up.edu.br", "192.168.61.28");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Digite o nome do site: <enter para terminar>:");
			String site = scan.nextLine();
			try {
				if (site.length() == 0) {
					break;
				} else if (relacao.containsKey(site)) {
					System.out.println("O IP do site: " + site + " é " + relacao.get(site));					
				} else {
					System.out.println("O site " + site + " não está cadastrado");
				}
			} catch (Exception e) {
				System.out.println("Ocorreu um erro durante a leitura!");
			}
		}
		scan.close();
	}
}
