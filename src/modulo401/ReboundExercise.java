package modulo401;

import java.util.Scanner;

public class ReboundExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int area, perimetro, base, altura;
		
		System.out.println("Ingrese la base del rectángulo: (en metros)");
		base = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingrese la altura del rectángulo: (en metros)");
		altura = sc.nextInt();
		sc.nextLine();
		
		area = base * altura;
		perimetro = (base * 2) + (altura * 2); 
		
	    System.out.println("El área del rectángulo es: " + area + " metros");
	    System.out.println("El perímetro del rectángulo es: " + perimetro + " metros");
		
		
		sc.close();
	}

}
