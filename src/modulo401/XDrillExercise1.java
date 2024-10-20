package modulo401;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class XDrillExercise1 {

	public static void main(String[] args) {
		Map<String, Double> productos = new HashMap<>();
		
		productos.put("cocina", (double) 299990);
		productos.put("lavadora", (double) 234540);
		productos.put("comedor", (double) 150990);
		productos.put("televisor", (double) 345100);
		
        DecimalFormat formato = new DecimalFormat("#.00");
		double sumaTotal = 0;
	
		for (Map.Entry<String, Double> producto : productos.entrySet()) {
			sumaTotal += producto.getValue();
		}
		
		double iva = sumaTotal * 0.19;
		double totalConIva = sumaTotal + iva;
		
		System.out.println("El total de su compra es: $" + sumaTotal);
		System.out.println("El IVA es: $" + iva);
		System.out.println("El total más IVA es: $" + totalConIva);
		System.out.println("El total de su compra en dólares es: US$" + formato.format(totalConIva/ 930.26));

	}

}
