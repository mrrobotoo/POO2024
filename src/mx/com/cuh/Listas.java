package mx.com.cuh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mx.com.cuh.DTO.Persona;

public class Listas {
	 
		public  static Persona crearPersona(String colorOjos, Float altura,String colorCabello,
				String colorPiel, String nacionalidad, Float peso) {
			Persona persona= new Persona();
			persona.setAltura(altura);
			persona.setColorCabello(colorCabello);
			persona.setColorOjos(colorOjos);
			persona.setColorPiel(colorPiel);
			persona.setNacionalidad(nacionalidad);
			persona.setPeso(peso);
			return persona;
		}
	 
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
		Persona personaObjeto =crearPersona(null, null, "negro", null, null, null);
		
		listaPersona.add(personaObjeto);
		listaPersona.add(crearPersona(null, null, "negro", null, null, null));

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
