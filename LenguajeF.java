package mx.com.cuh;

import java.util.Iterator;

public class LenguajeF {
	
	public static String convertirLenguajeF(String palabra) {
		
		char[] palbraSeparada =palabra.toLowerCase().toCharArray();
	    StringBuilder t=new StringBuilder();
	   
	    
		for (char c : palbraSeparada) {
			t.append(c);
			
			if(c == 'a' ) {
				t.append('f');
				t.append('a');
				
			}
			if(c == 'e' ) {
				t.append('f');
				t.append('e');
				
			}
			if(c == 'i') {
				t.append('f');
				t.append('i');
				
			}
			if(c== 'o') {
				t.append('f');
				t.append('o');
				
			}
			if(c== 'u') {
				t.append('f');
				t.append('u');
				
			}
			
			
		}
		System.out.println(t.toString());
		
		return null;
	}
	
	 public static void main(String[] args) {
		
		 
		 convertirLenguajeF("HOLA");
	 }
}
