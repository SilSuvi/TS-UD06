package UD06;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		long num;
		System.out.println("Introduce un número");
		num = scanner.nextLong();
		System.out.println("El factorial es: " + getFact(num));
		scanner.close();

	}

	public static long getFact(long num) {
		
		if(num == 0) return 1;
		return num * getFact(num - 1);
	}

}
