package mx.com.cuh;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        float num1 = scanner.nextFloat();
        
        System.out.print("Ingresa el segundo número: ");
        float num2 = scanner.nextFloat();
		
		System.out.println("Calculadora 1.Suma, 2. Resta, 3.Division, 4.multiplicación, 5. Exponente");
		int opcion = scanner.nextInt();
		
		if (opcion ==1) {
		    System.out.println(num1 + num2);
		} else if (opcion ==2) {
		    System.out.println(num1 - num2); 
		} else if (opcion ==3) {
		    System.out.println(num1 / num2); 
		} else if (opcion ==4) {
		    System.out.println(num1 * num2); 
		} else if (opcion ==5) {
			System.out.println(Math.pow(num1,num2));}
	}
}