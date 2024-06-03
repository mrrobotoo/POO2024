package mx.com.cuh;

import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desea imprimir: ");
        int cantidadDePrimos = scanner.nextInt();
        
        imprimirNumerosPrimos(cantidadDePrimos);
    }
    
    public static void imprimirNumerosPrimos(int cantidad) {
        int count = 0;
        int num = 2;
        
        while (count < cantidad) {
            if (esPrimo(num)) {
                System.out.print(num);
                count++;
                if (count < cantidad) {
                    System.out.print(", ");
                }
            }
            num++;
        }
        System.out.println(); 
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
