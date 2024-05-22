package mx.com.cuh;

import mx.com.cuh.DTO.Persona;

public class main {

	public static void Main(String[] args) {
		System.out.println("Hola");
		
		Persona persona1 = new Persona();
		persona1.setColorCabello("Castaño");
		persona1.setAltura(1.70F);
		persona1.setColorOjos("cafe");
		persona1.setColorPiel("prieto");
		persona1.setNacionalidad("peruano");
		persona1.setPeso(70F);
		
		
System.out.println("Hola"); 
		
		Perro perro1 = new Perro();
		perro1.setRaza("Husky");
		perro1.setColor("Blanco");
		perro1.setAltura(56F);
		perro1.setPeso(23F);
	    
		System.out.println("Su raza es " + perro1.getRaza()); 
		System.out.println("Es de color  " + perro1.getColor()); 
		
		System.out.println("El color de piel es " + persona1.getColorPiel());
		System.out.println(agregarInformacion("cola"));
	}
	
	private static  String agregarInformacion(String nombre) {
		return nombre;
		

	}

}
