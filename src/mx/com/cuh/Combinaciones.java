package mx.com.cuh;

public class Combinaciones {


    public static void main(String[] args) {
        int n = 5; // Tamaño del conjunto total
        int k = 3; // Cantidad de elementos a elegir
        long resultado;
        if (k == 0 || k == n) {
            resultado= 1;
        } else {
             resultado = 1;
             
            for (int i = 1; i <= 3; i++) {
            
            	System.out.println("el valor de k es "+ n + k + i);


                resultado *= (n - k + i);
                resultado /= i;
            }
        
        }

        System.out.println("El número de combinaciones de " + n + " elementos tomados de " + k + " en uno es: " + resultado);
    }
}