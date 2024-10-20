package modulo403;

import java.util.Scanner;

public class XDrillExercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   Boolean entrada = false;
		   int numero; 
		   int numeroPar = 0; 
		   int numeroImpar = 0;
		   
		  do {
			  System.out.println("Ingrese un número entre 1 y 100: ");
			  numero = sc.nextInt();
			  
			  if (numero < 1 || numero > 100 ) {
				  System.out.println("-----------Error");		  
				  System.out.println();
			  } else {
				 for(int i = 1; i <= numero; i++) {
					 if (i % 2 == 0) {
						 numeroPar++;
					 } else {
						 numeroImpar++;
					 }
				 }
				 
				 System.out.println("El total de números pares es de: " + numeroPar);
				 System.out.println("El total de números impares es de: " + numeroImpar);
				 System.out.println("--Fin del Programa--");
				 
				 entrada = true;
			  }
			
		   } while (!entrada);
			
			
			
			
			sc.close();

	}

}
