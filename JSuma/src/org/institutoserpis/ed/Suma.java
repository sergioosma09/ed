package org.institutoserpis.ed;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduce un numero");
	String primernumero = scanner.nextLine();
	int primero = Integer.parseInt(primernumero);
	System.out.println("Introduce el segundo");
	String segundonumero = scanner.nextLine();
	int segundo = Integer.parseInt(segundonumero);
	int suma = primero + segundo;
	System.out.println("La suma vale "+ suma);
	
	}

}
