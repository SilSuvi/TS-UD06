package UD06;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;

		Scanner scan = new Scanner(System.in);

		System.out.println("A�ada un n�mero entero: ");
		numero = scan.nextInt();

		if (primo(numero)) System.out.println("Es un n�mero primo");
		else System.out.println("NO es un n�mero primo");

		scan.close();

	}

	public static boolean primo(int numero) {
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
