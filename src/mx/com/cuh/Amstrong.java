package mx.com.cuh;

import java.util.Scanner;

public class Amstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         /*System.out.println("Ingresar un número de 3 dígitos: ");
        int numero = scanner.nextInt();
        int resultado = 0;
        int original = numero;

        while (numero != 0) {
            int digito = numero % 10;
            resultado += Math.pow(digito, numero);
            numero /= 10;
        }

        if (resultado == original) {
            System.out.println(original + " es un número de Armstrong.");
        } else {
            System.out.println(original + " no es un número de Armstrong.");
        }

        scanner.close();
    }

    */

            System.out.println("Ingresa numero");
            int n = scanner.nextInt();
            
            System.out.println((isArmstrong(n))? "Es un Armstrong" : "No es un Armstrong");
        }

    private static boolean isArmstrong(int num) {
    	int temporal = num, digitos=0, ultimoDigito=0, suma=0;
    	digitos = (int) (Math.log10(num) + 1);
    	temporal = num;
    	while(temporal>0) {
    		ultimoDigito = temporal % 10;
    		suma += (Math.pow(ultimoDigito, digitos));
    		temporal = temporal /10;
    	}
    	if (num==suma)
    		return true;
    	else 
    		return false;
    	
    	
            
            }
        }