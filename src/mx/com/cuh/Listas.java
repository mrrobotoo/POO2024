package mx.com.cuh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mx.com.cuh.DTO.Persona;

public class Listas {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		
		for (int i = 0 ; i <= 1000; i++);{
				
		}
		
		for (Integer x : listaNumeros) {
			if (x%2 !=0) {
				listaNumeros.set(1, 100000);
			}
			if (x == 100000) {
				System.out.println("GANO UN AUTO");
			}
			System.out.println(x);
		}
		
		List<Persona> listaPersona = new ArrayList<Persona>();
		listaPersona.add(new Persona("negro",null,null,null,null,null));
		Persona persona;
		
		for (Persona persona1 : listaPersona) {
			persona1 = new Persona ();
			persona1.setColorCabello("rojo");
			listaPersona.add(persona1);
			persona1.setColorCabello("lila");
			System.out.println(persona1.getColorCabello());
		}
		

	}

}
