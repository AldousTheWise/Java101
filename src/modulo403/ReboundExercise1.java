package modulo403;

import java.util.Scanner;

public class ReboundExercise1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		String patron1 = "";
		
		System.out.println("Ingresa un número: ");
		int numero = sc.nextInt();
		
		System.out.println();
		System.out.println("Patrón 1");
		
		for(int i = 1; i <= numero; i++ ) {
			if(i % 2 != 0) {
				patron1 += "*";
			} else {
				patron1 += "-";
			}		
		}
		
		System.out.println(patron1);
		
		System.out.println();
		
		System.out.println("Patrón 2");		
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {
				if ( i == 1 || i == numero || j == 1 || j == numero) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		
		sc.close();

	}

}
