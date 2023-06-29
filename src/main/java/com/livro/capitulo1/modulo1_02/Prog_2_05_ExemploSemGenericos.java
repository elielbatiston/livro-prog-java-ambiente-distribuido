package com.livro.capitulo1.modulo1_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Prog_2_05_ExemploSemGenericos {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		Integer num1 = 1;
		Integer num2 = 2;
		String str = "3";
		Integer num4 = 4;
		l.add(num1);
		l.add(num2);
		/* Caso o objeto l foi definido com generico o compilador gerara erro de compilação. Por
		 * isto essa linha deve ser comentada
		 */
		// l.add(str);
		l.add(num4);
		Iterator<Integer> numbers = l.iterator();
		while (numbers.hasNext()) {
			Integer integer = (Integer) numbers.next();			
			System.out.println(integer.intValue());
		}
	}
}
