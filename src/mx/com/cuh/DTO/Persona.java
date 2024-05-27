package mx.com.cuh.DTO;

public class Persona {
	private String colorCabello;
	private String colorOjos;
	private String colorPiel;
	private Float altura;
	private Float peso;
	private String nacionalidad;
		
	public String getColorCabello() {
		return colorCabello;
	}
	
	public Persona() {
		super();
		
	}
	public Persona(String cola, String colorOjos, String colorPiel, Float altura, Float peso,
			String nacionalidad) {
		super();
		this.colorCabello =  "";
		this.colorOjos = colorOjos;
		this.colorPiel = colorPiel;
		this.altura = altura;
		this.peso = peso;
		this.nacionalidad = nacionalidad;
	}
	
	public Persona(String colorCabello, String colorOjos) {
		super();
		this.colorCabello = colorCabello;
		this.colorOjos = colorOjos;
	}
	public void setColorCabello(String colorCabello) {
		this.colorCabello = colorCabello;
	}
	
	public String getColorOjos() {
		return colorOjos;
	}
	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	
}
