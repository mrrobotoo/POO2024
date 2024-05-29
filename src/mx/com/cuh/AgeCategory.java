package mx.com.cuh;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int num1 = scanner.nextInt();

        if (num1 <= 13)System.out.println("niño");
         else if (num1 > 13 && num1 <= 17)System.out.println("adolescente");
         else if (num1 >= 18 && num1 <= 64) System.out.println("adulto");
         else if (num1 >= 65) System.out.println("adulto mayor");
        
        scanner.close();
    }
}

	
		
