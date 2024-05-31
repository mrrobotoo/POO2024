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
	     
		
	}
	

}
