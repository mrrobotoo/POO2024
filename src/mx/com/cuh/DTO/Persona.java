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
	
	public class Perro {
		private String Raza;
		private String Color;
		private Float Altura;
		private Float Peso;
	
		public String getRaza() {
	        return Raza;
	    }

	    public void setRaza(String Raza) {
	        this.Raza = Raza;
	    }

	    public String getColor() {
	        return Color;
	    }

	    public void setColor(String Color) {
	        this.Color = Color;
	    }

	    public float getAltura() {
	        return Altura;
	    }

	    public void setAltura(Float Altura) {
	        this.Altura = Altura;
	    }

	    public float getPeso() {
	        return Peso;
	    }

	    public void setPeso(Float Peso) {
	        this.Peso = Peso;
	    }
		
		
	}
}
