package mx.com.cuh;

import mx.com.cuh.DTO.Persona;

public class main {

	public static void main(String[] args) {
		System.out.println("Hola");
		
		Perro perro1 = new Persona();
		perro1.setColorPelo("Castaño");
		perro1.setTamaño(60F);
		perro1.setColorOjos("cafe");
		perro1.setRaza("Aleman");
		perro1.setPeso(30F);
		
		
		System.out.println("El color de pelo es " + perro1.getColorPiel());
		System.out.println(agregarInformacion("cola"));
	}
	
	private static  String agregarInformacion(String nombre) {
		return nombre;
	} 
}

