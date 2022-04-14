package UD06;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numeroString = null;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese número a continuación: ");
		int num = scanner.nextInt();
		scanner.close();

		System.out.println("***VAMOS A VERIFICAR EL NÚMERO INTRODUCIDO CON VALOR " + num);

		if (num > 0) numeroString = String.valueOf(num);
		else System.out.println("No es un número entero positivo, por tanto no es válido");

		obtenerCifras(numeroString);
	}

	public static void obtenerCifras(String number) {
		System.out.println("El número de de cifras del valor introducido es de: " + number.length());
	}
}
