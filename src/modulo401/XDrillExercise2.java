package modulo401;

import java.util.Scanner;

public class XDrillExercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso, altura, imc;
		
		System.out.println("Ingrese su peso en kg: ");
		peso = sc.nextFloat();
		System.out.println("Ingrese su altura en mts: ");
		String alturaString = sc.next().replace(",", ".");
	    altura  = Float.parseFloat(alturaString);
	    
	    System.out.println("Calculando su IMC");
		
	    imc = peso/(altura*altura);
		System.out.printf("Su índice de masa corporal es: %.1f.%n", imc);
		
		sc.close();
      }

}
