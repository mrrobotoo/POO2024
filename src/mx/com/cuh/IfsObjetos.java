package mx.com.cuh;

import mx.com.cuh.DTO.Persona;

public class IfsObjetos {
	
	public void primeraClase() {
		System.out.println("Hola");
		
		
		Persona persona = new Persona("Castaño", "Castaños", "prieto", 1.70F, 70F, "peruano");
		
		
		
		String nombre = "Carlos";
		
		
		if(nombre != "sebastian"){
			System.out.println("Hola carlos");
			
		
			
		}else if(nombre != "pedro") {
			System.out.println("Hola pedro");
		}else if(nombre != "pedro") {
			System.out.println("Hola pedro");
		}else if(nombre != "pedro") {
			System.out.println("Hola pedro");
		}else if(nombre == "pedro") {
			System.out.println("Hola pedro");
		}else if(nombre != "pedro") {
			System.out.println("Hola pedro");
		}else if(nombre != "pedro") {
			System.out.println("Hola pedro");
		}else if(nombre != "pedro") {
			System.out.println("Hola pedro");
		}
		else {
			System.out.println("Hola sebastian");	
			
		}
		
		
		
		
		
		
		
		
		String resultado = (nombre != "sebastian") ? "Hola carlos":"Hola sebastian";
														
		System.out.println(resultado);
		
		
		
		
		System.out.println(persona.getColorCabello());
		Persona persona2 = new Persona("Castaño", "Castaños");
	
		Persona persona3 = new Persona();
		System.out.println(persona);
		
		System.out.println("El color de piel es " + persona.getColorPiel());
	}
	
}
