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
			}else if (edad >= 13 && edad <= 17) {
				categoria = "Adolescente";
			}else if (edad >= 18 && edad <= 64) {
				categoria = "Adulto";
			}else if (edad >=65) {
				categoria = "Adulto Mayor"; 
			}
			scanner.close();
		}
		    
		     
	}
