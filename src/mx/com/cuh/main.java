/*package mx.com.cuh;

import mx.com.cuh.DTO.Persona;

public class main {

	public static void main(String[] args) {
		System.out.println("Hola");
		
		Perro perro1 = new Persona();
		perro1.setColorCabello("Castaño");
		perro1.setAltura(1.70F);
		perro1.setColorOjos("cafe");
		perro1.setColorPiel("prieto");
		perro1.setNacionalidad("peruano");
		perro1.setPeso(70F);
		
		
		System.out.println("El color de piel es " + perro1.getColorPiel());
		System.out.println(agregarInformacion("cola"));
	}
	
	private static  String agregarInformacion(String nombre) {
		return nombre;
	} 
*/
}
package mx.com.cuh;

import mx.com.cuh.DTO.Perro;

public class main {

	public static void main(String[] args) {
		System.out.println("Hola");
		
		Perro perro1 = new Perro();
		perro1.setColorCabello("Castaño");
		perro1.setAltura(1.70F);
		perro1.setColorOjos("cafe");
		perro1.setColorPiel("prieto");
		perro1.setNacionalidad("peruano");
		perro1.setPeso(70F);
		
		
		System.out.println("El color de piel es " + perro1.getColorPiel());
		System.out.println(agregarInformacion("cola"));
	}
	
	private static  String agregarInformacion(String nombre) {
		return nombre;
	}

}
