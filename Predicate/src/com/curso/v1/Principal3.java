package com.curso.v1;

public class Principal3 {
	public static void main(String[] args) {
		
		System.out.println("Principal3");
		
		Predicado pre1 =  x -> x.length() > 10;
		
		boolean b = pre1.probar("HolaMundoJava");
		System.out.println(b); //true
		
		Predicado pre2 = cadena -> cadena.length() > 10;
		
		b = pre2.probar("Hola");
		System.out.println(b); //false
		
		Predicado pre3 = w -> w.contains("x");
		
		b = pre3.probar("jaxva");
		System.out.println(b); //true
		
		Predicado pre4 = pato -> pato.endsWith("zz");
		
		b = pre4.probar("jaxvazz");
		System.out.println(b); //true
	}
}
