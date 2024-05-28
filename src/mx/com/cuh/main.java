package mx.com.cuh;

import java.util.Scanner;

import mx.com.cuh.DTO.Persona;

public class main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Ingresa el primer numero pay:");
		int num1 = scanner.nextInt();

		System.out.println("Ingresa el primer numero pay:");
		int num2 = scanner.nextInt();
		
		System.out.println("Calculadora 1.Suma, 2. Resta, 3.Division, 4.multiplicación, 5. Exponente");
		int opcion = scanner.nextInt();
		
		if (opcion ==1) {
			System.out.println(num1 + num2);
			
		}else if (opcion ==2) {
			System.out.println(num1 - num2); 
			
		}else if (opcion ==3) {
			System.out.println(num1 / num2);
			
		}else if (opcion ==4) {
			System.out.println(num1 * num2);
			
		}else if (opcion ==5) {
			System.out.println(Math.pow(num1,num2)); 
			
			
		}
	
	}
	
	

}
