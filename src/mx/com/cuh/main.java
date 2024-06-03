package mx.com.cuh;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Scanner;

import mx.com.cuh.DTO.Persona;

public class main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	     System.out.println("Ingresa el primer número: ");
	     int numero = scanner.nextInt();
	     int numeroParaDo =  numero;
	     int temp =1;
	     for (int i = 0; i < temp ; i++) {
	    	 System.out.println("paso número " + i);
	    	 if(numero ==1) {
	    		break; 
	    	 }
	    	 //Saber si es par o impar
		     if(numero%2 == 0) {//par
		    	  numero = numero / 2;
		     }else {//impar
		    	  numero = 3*numero+1;
		     }
		     temp = temp+1;
	     }
	     System.out.println("for  " +numero);
	    
	     int contadorDeDo =0;
	     do {
	    	 contadorDeDo =contadorDeDo +1;
	    	 //Saber si es par o impar
		     if(numeroParaDo%2 == 0) {//par
		    	 numeroParaDo = numeroParaDo / 2;
		     }else {//impar
		    	 numeroParaDo = 3*numeroParaDo+1;
		     }
		     
		} while (numeroParaDo !=1);
	     
	     System.out.println("do  pasos "+contadorDeDo+ "numero es" + numeroParaDo);
	     
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un numero: ");
		int num1= sc.nextInt();
		
		System.out.println("ingrese un numero: ");
		int num2= sc.nextInt();
		
		int resultado= num1+num2;
		System.out.println("El resultado es:  " + resultado);
		
		
		/*float num1 =5;
		float num2 =6;
		
		System.out.println("Calculadora 1.Suma, 2. Resta, 3.Division, 4.multiplicación, 5. Exponente");
		int opcion =1;
		
		if (opcion ==1) {
			System.out.println(num1 + num2);
		}
		else if (opcion ==2) {
			System.out.println(num1 - num2); 
		}
		else if (opcion ==3) {
			System.out.println(num1 / num2); 
		}
		else if (opcion ==4) {
			System.out.println(num1 * num2); 
		}
		else if (opcion ==5) {
			System.out.println(Math.pow(num1,num2));
		}*/
		
		
	}
	

}
