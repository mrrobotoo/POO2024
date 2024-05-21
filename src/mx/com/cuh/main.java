package mx.com.cuh;

import mx.com.cuh.DTO.Persona;

public class main {

	public static void main(String[] args) {
		System.out.println("Hola");
		
		Persona persona1 = new Persona();
		persona1.setColorCabello("Castaño");
		persona1.setAltura(1.70F);
		persona1.setColorOjos("cafe");
		persona1.setColorPiel("prieto");
		persona1.setNacionalidad("peruano");
		persona1.setPeso(70F);
		
		
		System.out.println("El color de piel es " + persona1.getColorPiel());
		System.out.println(agregarInformacion("cola"));
	}
	
	private static  String agregarInformacion(String nombre) {
		return nombre;
	}

}
