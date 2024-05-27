package mx.com.cuh;

import mx.com.cuh.DTO.Persona;

public class main {

	public static void main(String[] args) {
		float num1 =5;
		float num2 =6;
		
		System.out.println("Calculadora 1.Suma, 2. Resta, 3.Division, 4.multiplicación, 5. Exponente");
		int opcion =6;
		
		if (opcion ==1) {
			System.out.println(num1 + num2);
		}else if (opcion ==2) {
			System.out.println(num1 - num2); 
		}
		 
		
		System.out.println(num1 / num2); 
		System.out.println(Math.pow(num1,num2)); 
	}
	
	

}
