package com.livro.capitulo1.modulo1_01;

import java.util.*;

public class Prog_1_02_ExemploDefinicaoCollectionParametro {

    public static void main(String[] args) {
        Collection<String> obj = new ArrayList<>();
        alterarCollection(obj, "Livro de Programação Java com Ênfase em OO");
        Collection<String> obj1 = new HashSet<>();
        alterarCollection(obj1, "Redes de Computadores - Teoria e Pratica");
        listaCollection(obj);
        listaCollection(obj1);
    }

    static void alterarCollection(Collection<String> obj, String str) {
        obj.add(str);
    }

    static void listaCollection(Collection<String> obj) {
        Iterator<String> it = obj.iterator();
        while(it.hasNext()) {
            System.out.println("Recuperando: " + it.next());
        }
    }
}
