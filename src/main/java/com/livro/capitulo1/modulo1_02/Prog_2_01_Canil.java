package com.livro.capitulo1.modulo1_02;

import java.util.ArrayList;
import java.util.List;

public class Prog_2_01_Canil {
	public static void main(String[] args) {
		List canil = new ArrayList();
		canil.add(new Prog_2_02_Cachorro("Kaka"));
		canil.add(new Prog_2_03_Gato("Doro"));
		List<Prog_2_02_Cachorro> canilDog = new ArrayList<>();
		canilDog.add(new Prog_2_02_Cachorro("Pluto"));
		// Não permite adicionar um gato em um canil de cachorros
		// canilDog.add(new Prog_2_03_Gato("Cherry"));		
	}
}
