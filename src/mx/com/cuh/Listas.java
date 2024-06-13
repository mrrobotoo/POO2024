package mx.com.cuh;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa peso: "); 
        Float peso = scanner.nextFloat();
        
        System.out.println("Ingresa otro Altura(En metros): "); 
        Float Altura = scanner.nextFloat();
        
        Float imc = peso / (Altura *Altura);
        System.out.println("Su masa corporal es de (Kilogramos): " + imc + ";)");
        if (imc < 16) {
            System.out.println("Delgadez Severa");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Delgadez Moderada"); 
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Delgadez Leve"); 
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso Normal"); 
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso"); 
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidad Leve");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidad Moderada");
        } else if (imc >= 40) {
            System.out.println("Obesidad Mórbida");
        }
        
        scanner.close();
         }
}