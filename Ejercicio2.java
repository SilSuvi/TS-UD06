package UD06;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int cantidad;
		int resultado[];

		System.out.println("¿Cuántos números? ");

		Scanner scanner = new Scanner(System.in);
		cantidad = scanner.nextInt();

		resultado = alea(cantidad);
		System.out.println("Mostrando " + cantidad + " números aleatorios");
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
		scanner.close();
	}

	public static int[] alea(int cantidad) {
		int[] numeros = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}
		return numeros;
	
	}
}
