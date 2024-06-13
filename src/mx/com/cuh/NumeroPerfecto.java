package mx.com.cuh;
import java.util.Scanner;
public class NumeroPerfecto {

		    public static void main(String[] args) {
		        Scanner  scanner = new Scanner(System.in);
		        
		        int suma = 0, count =1;
		        
		        System.out.println("Ingresar numero Perfecto: ");
		        int n = scanner.nextInt();
		        do {
		        	if(n % count == 0) {
		        		suma = suma + count;
		        	}
		        	count++;
		        } while (count<n);
		        if(suma ==n) {
		        	System.out.println("El numero es perfect: ");
		        }else {
		        	System.out.println("El numero no es perfecto");}
		    }
		}

