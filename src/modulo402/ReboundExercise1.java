package modulo402;

import java.util.Scanner;

public class ReboundExercise1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		
		int[] valores = new int[5];
		int total = 0;
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Ingresa el valor del producto " + (i + 1) + " :");
			valores[i] = sc.nextInt();
			total += valores[i];
		}
		
		if (total <= 10000) {
			System.out.print(nombre + " pagarás en efectivo $" + total);
		} else if (total >= 10001 && total <= 20000){ 
			System.out.print(nombre + " pagarás con tarjeta $" + total);
		} else {
			System.out.print(nombre + " pagarás con cheque $" + total);
		}
		
		sc.close();

	}

}
