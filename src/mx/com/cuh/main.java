package mx.com.cuh;


import java.util.ArrayList;
import java.util.List;

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
		}else if (opcion ==3) {
			System.out.println(num1 / num2);
		}else if (opcion ==4) {
			System.out.println(num1 *= num2);
		}else if (opcion ==5) {
			System.out.println(Math.pow(num1,num2)); 
			
		
		}
		
		
		Persona persona;

		List<Persona> personas = new ArrayList<Persona>();
		
		for (float i = 0; i < 50; i++) {
			
		    persona = new Persona();
			persona.setAltura(i);
			personas.add(persona);
			
			
		}
		

		int j = 0;
		for (Persona x : personas) {
			System.out.println("la altura de la persona  "+ j
		+ "es "+x.getAltura());
			j = j +1;
		}
		
	}
	
	

		
		
		

}
