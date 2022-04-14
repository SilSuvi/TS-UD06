package UD06;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		numero = scanner.nextInt();
		convertir(numero);
	}

	public static void convertir(int num){
        int[] binario = new int[35]; // ARRAY QUE ALMACENAR� EL RESULTADO
        int sumaResto = 0;
 
        while (num > 0) {// VERIFICA QUE EL N�MERO SEA POSITIVO PARA EVALUAR
            binario[sumaResto++] = num % 2; // SUMA EL RESTO DE LA DIVISION DEL N�UMERO
            num = num / 2;
        }
 
        printBinary(binario, sumaResto);// encapsula al otro m�todo
    }
	
	
	 public static void printBinary(int[] binario, int sumaResto) {
	        for (int i = sumaResto - 1; i >= 0; i--) { //RECORRE LAS POSICIONES DE LA SUMA DEL RESTO
	            System.out.print(binario[i] + "");
	    }
	 }

}
