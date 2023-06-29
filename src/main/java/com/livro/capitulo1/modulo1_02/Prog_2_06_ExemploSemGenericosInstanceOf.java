package com.livro.capitulo1.modulo1_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Prog_2_06_ExemploSemGenericosInstanceOf {
	public static void main(String[] args) {
		List l = new ArrayList();
		Integer num1 = 1;
		Integer num2 = 2;
		String str = "3";
		Integer num4 = 4;
		l.add(num1);
		l.add(num2);
		/* Ao adicionar a string não apresenta erro de compilação, mas causa um erro em tempo de 
		 * execução do tipo ClassCastExeception
		 */
		l.add(str);
		l.add(num4);
		Iterator numbers = l.iterator();
		while (numbers.hasNext()) {
			Integer integer = null;
			Object obj = numbers.next();
			if (obj instanceof Integer) {
				integer = (Integer) obj;
				System.out.println(integer.intValue());
			} else {
				if (obj instanceof String) {
					System.out.println("Um objeto do tipo String foi encontrado.");
				} else {
					System.out.println("Um objeto de outro tipo desconhecido foi encontrado.");
				}
			}				
		}
	}
}
