package com.livro.capitulo1.modulo1_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Prog_1_01_ExemploDefinicaoCollection {

    public static void main(String[] args) {

        Collection<String> obj = new ArrayList<>();
        obj.add("Programação Java com ênfase em Orientação a Objetos.");
        /* Esta próxima linha gera erro de compilação.
            O tipo definido da coleção só permite adicionar Strings. */
        // obj.add(100);
        System.out.println("Acessando objeto: " + ((List<String>)obj).get(0));
    }
}
