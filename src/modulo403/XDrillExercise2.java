package modulo403;

import java.util.Scanner;

public class XDrillExercise2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//contador, numero, numeroPositivo, numeroNegativo;	
		int numeroPositivo = 0;
		int numeroNegativo = 0;
		int numeroCero = 0;
		
		int contador = 1;
		
		
		do {
			System.out.println("Ingrese un numero: ");
			System.out.println(contador + "/10");
			
			int numero = sc.nextInt();
			
			if (numero == 0) {
				numeroCero++;
			} else if (numero > 0) {
				numeroPositivo++;
			} else {
				numeroNegativo++;
			}
				contador ++;
		} while (contador <= 10);
		
		System.out.println("El número de ceros introducido fue " + numeroCero);
		System.out.println("El número de cifras positivas fue " + numeroPositivo);
		System.out.println("El número de cifras negativas fue " + numeroNegativo);
		sc.close();

	}

}
