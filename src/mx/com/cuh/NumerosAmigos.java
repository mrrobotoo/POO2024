package mx.com.cuh;
import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingresar número 1: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Ingresar número 2: ");
        int numero2 = scanner.nextInt();
        
        if (sonAmigos(numero1, numero2)) {
            System.out.println(numero1 + " y " + numero2 + " Son Amigos."); 
        } else {
            System.out.println(numero1 + " y " + numero2 + " No son Amigos.");
        }
        
        scanner.close(); 
    }
    

    public static boolean sonAmigos(int num1, int num2) {
        int sumaNum1 = sumaDivisores(num1);
        int sumaNum2 = sumaDivisores(num2);
        return sumaNum1 == num2 && sumaNum2 == num1;
    }
    
    public static int sumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}

