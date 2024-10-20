package modulo402;

import java.util.Scanner;

public class XDrillExercise1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int temperatura;
		
		System.out.println("Bienvenido:");
		System.out.println("Por favor, ingrese la temperatura actual: ");
		temperatura = sc.nextInt();
		
		if(temperatura <= 10) {
			System.out.println("Hay " + temperatura + " grados. El clima de hoy es frío.");
		} else if (temperatura >= 11 && temperatura <= 20 ) {
			System.out.println("Hay " + temperatura + " grados. El clima de hoy es nublado.");
		} else if (temperatura > 21 && temperatura < 30 ) {
			System.out.println("Hay " + temperatura + " grados. El clima de hoy es caluroso.");
		} else {
			System.out.println("Hay " + temperatura + " grados. El clima de hoy es tropical.");
		}

		sc.close();

	}

}
