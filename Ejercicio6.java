package UD06;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numeroString = null;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese n�mero a continuaci�n: ");
		int num = scanner.nextInt();
		scanner.close();

		System.out.println("***VAMOS A VERIFICAR EL N�MERO INTRODUCIDO CON VALOR " + num);

		if (num > 0) numeroString = String.valueOf(num);
		else System.out.println("No es un n�mero entero positivo, por tanto no es v�lido");

		obtenerCifras(numeroString);
	}

	public static void obtenerCifras(String number) {
		System.out.println("El n�mero de de cifras del valor introducido es de: " + number.length());
	}
}
