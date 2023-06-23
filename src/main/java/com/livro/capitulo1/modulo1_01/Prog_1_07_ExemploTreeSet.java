package com.livro.capitulo1.modulo1_01;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Prog_1_07_ExemploTreeSet {

    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Java");
        set.add("C++");
        set.add("Smalltalk");
        //Por ser repetido não será inserido no conjunto
        set.add("Java");
        set.add("Delphi");
        set.add("PHP");
        //Imprimir todos os objetos do conjunto. A impressão ocorrerá sem ordem.
        System.out.println("Imprimir todos os objetos de uma única vez: " + set);
        /* Para recuperar os objetos de um conjunto individualmente devemos utilizar um iterator. */
        Iterator<String> it = set.iterator();
        System.out.println("Imprimindo cada objeto do conjunto");
        while(it.hasNext()) {
            Object val = it.next();
            System.out.println("********************************");
            System.out.println(val.toString());
        }
    }
}
