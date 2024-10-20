package modulo402;

import java.util.Scanner;

public class XDrillExercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saldo, opcion, monto;
		
		saldo = 1000;
		opcion = 0;
		
		do {
			System.out.println("Seleccione una opción: ");
			System.out.println("1. Depositar dinero a mi cuenta.");
			System.out.println("2. Retirar dinero de mi cuenta");
			System.out.println("3. Salir");
			
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Su saldo actual es de " + saldo + " usd.");
				System.out.println("Ingrese el monto a depositar:");
				monto = sc.nextInt();
				saldo += monto;
				System.out.println("Su nuevo saldo es de " + saldo + " usd.");
				System.out.println("Gracias por preferirnos.");
				break;
			case 2:
				System.out.println("Su saldo actual es de " + saldo + " usd.");
				System.out.println("Ingrese el monto a retirar:");
				monto = sc.nextInt();
				
				if(saldo <= 0 || saldo < monto ) {
					System.out.println("Su saldo es insuficiente para esta operación.");
				} else {
					saldo -= monto;
					System.out.println("Su nuevo saldo es de " + saldo + " usd");
					System.out.println("Gracias por preferirnos.");
				}
				
				break;
			case 3:
				System.out.println("Hasta pronto");
				break;
			default:
				System.out.println("Ingrese una opción válida");
				
			}
			
			System.out.println();
			
		} while (opcion != 3);
		
		sc.close();

	}

}
