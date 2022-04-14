package UD06;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {

		int figura = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Elegir figura");
			System.out.println("[1] C�rculo");
			System.out.println("[2] Tri�ngulo");
			System.out.println("[3] Cuadrado");
			System.out.println("[0] Salir");
			figura = scanner.nextInt();
			switch (figura) {
			case 1:
				System.out.print("Ingrese radio del c�rculo: ");
				System.out.println("El �rea del c�rculo es: " + areaCirculo(scanner.nextDouble()));
				break;
			case 2:
				System.out.print("Ingrese base y la altura del tri�ngulo: ");
				System.out.println(
						"El �rea del tri�ngulo es: " + areaTriangulo(scanner.nextDouble(), scanner.nextDouble()));
				break;
			case 3:
				System.out.print("Ingrese lado del cuadrado: ");
				System.out.println("El �rea del cuadrado es: " + areaCuadrado(scanner.nextDouble()));
				break;
			case 0:
				System.out.println("Opci�n no v�lida, cerrando aplicaci�n...");
			}
			if (figura == 0)
				break;
			System.out.println();

		}
		scanner.close();

	}

	public static double areaCirculo(double radio) {
		return Math.PI * (Math.pow(radio, 2));
	}

	public static double areaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}

	public static double areaCuadrado(double lado) {
		return lado * lado;
	}

}
