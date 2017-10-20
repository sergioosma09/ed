package org.institutoserpis.org;

import java.util.Random;
import java.util.Scanner;

public class adivina {

	public static void main(String[] args) {
		Random  random= new Random();
		int numaleatorio= random.nextInt(1000)+1;
		System.out.println("Numero aleatorio " + numaleatorio);
		Scanner scanner= new Scanner(System.in);
		int contadordeIntentos=1;
		System.out.printf("Adivina el numero (entre 1 a 1000)[intento %d]: ", contadordeIntentos);
		String numero= scanner.nextLine();
		int numerointroducido = Integer.parseInt(numero);
		while (numerointroducido != numaleatorio) {
			contadordeIntentos++;
			if(numaleatorio< numerointroducido)
				System.out.printf("Es menor que ese. Vuelve a intentarlo [intento %d]: ", contadordeIntentos);
			else
				System.out.printf("Es mayor que ese. Vuelve a intentarlo [intento %d]: ", contadordeIntentos);
			numero= scanner.nextLine();
			numerointroducido = Integer.parseInt(numero);
			
		}
		System.out.printf("Enhorabuena has acertado en %s %s.", contadordeIntentos, 
				contadordeIntentos==1 ? "intento":"intentos");
	}

}
