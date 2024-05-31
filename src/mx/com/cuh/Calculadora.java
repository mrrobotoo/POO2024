package mx.com.cuh;
import java.util.Scanner;
public class Calculadora {
	
	public void calculadora () {
		
			 Scanner scanner = new Scanner(System.in);

		        System.out.println("Ingresa tu edad: ");
		        int edad = scanner.nextInt();

		        String categoria; 

			if (edad <13) {
				categoria = "Niño";
			}else if (edad > 13 && edad < 17) {
				categoria = "Adolescente";
			}else if (edad >= 18 && edad <= 64) {
				categoria = "Adulto";
			}else if (edad >65) {
				categoria = "Adulto Mayor"; 
			}
			scanner.close();
		}
		    
	public static void Main(String[] args) {

	 Scanner scanner = new Scanner(System.in);

       System.out.println("Ingresa el primer número: ");
       float num1 = scanner.nextFloat();

       System.out.println("Ingresa el segundo número: ");
       float num2 = scanner.nextFloat();

       System.out.println("Calculadora: 1. Suma, 2. Resta, 3. División, 4. Multiplicación, 5. Exponente");
       System.out.print("Elige una opción: ");
       int opcion = scanner.nextInt();

	if (opcion ==1) {
		System.out.println(num1 + num2);
	}else if (opcion ==2) {
		System.out.println(num1 - num2); 
	}else if (opcion ==3) {
		System.out.println(num1 * num2); 
	}else if (opcion ==4) {
		System.out.println(num1 / num2); 
	}else if (opcion ==5) {
		System.out.println(Math.pow(num1,num2)); 
	}
	scanner.close();
	
	for (int i = 0; i < args.length; i++) {
		
	}
}
   
    
}

		     
