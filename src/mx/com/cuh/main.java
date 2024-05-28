package mx.com.cuh;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la edad: ");
		int edad = scanner.nextInt();
		
		if (edad <13) {
		    System.out.println("Niño ");
		} else if (edad >= 14 && edad <= 17) {
		    System.out.println("Adolesente "); 
		} else if (edad >= 18 && edad <= 64) {
		    System.out.println("Adulto "); 
		} else if (edad >=64) {
		    System.out.println("Adulto Mayor "); 
		} else if (edad ==5) {
	}
	}
}