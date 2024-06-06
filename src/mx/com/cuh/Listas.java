package mx.com.cuh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mx.com.cuh.DTO.Persona;

public class Listas {
	 public static void main(String[] args) {
	  
		 
		 List<Integer>  listaNumeros = new ArrayList<Integer>();
		
		 for(int i = 0 ; i<=1000; i++) {
			 listaNumeros.add(i);
		 }
		 
		 
		 for (Integer x : listaNumeros) {
			 
			 if(x%2 != 0) {
				 listaNumeros.set(1, 100000);
			 }
			 if(x == 100000) {
				 System.out.println("GANO UN AUTO");
			 }
			System.out.println(x);
		}
		 
		List<Persona> listaPersona = new ArrayList<Persona>();
		listaPersona.add(new Persona("negro",null,null,null,null,null));
		Persona personaa;
		
		 for (Persona persona : listaPersona) {
			 personaa = new Persona();
			 personaa.setColorCabello("rojo");
			 listaPersona.add(personaa);
			persona.setColorCabello("lila");
			System.out.println(persona.getColorCabello());
		}
		 
	
		 
		 
	 }

}
