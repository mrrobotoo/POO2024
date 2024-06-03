package mx.com.cuh;

import java.util.Scanner;
public class fibonacci { 
	public static void main(String[] args) {
		
			
			int cantidadEnSecuencia = 15;
			
			int a = 0;
			int b = 1;
			int c ;
			
			for (int i = 0; i< cantidadEnSecuencia; i++) {
				
				c= a+b;
				a = b;
				b = c;
				
				System.out.println(c);
				
				
			}
		
		        
		}
	
}
