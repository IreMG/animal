
public class Animal {
	private String raza;
	private String nombre;
	private int edad;
	private int velocidad;
	private String sexo;
	
	public Animal(String raza, String nombre, int edad, int velocidad, String sexo) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.velocidad =0;
		this.sexo = sexo;
	}

	public int Acelerar() {
		if (raza=="felino") {
		this.velocidad+=20;
		}
		else {
			this.velocidad+=5;
		}
		return this.velocidad;
	}
	public int desacelerar() {
		velocidad+=-10;
		return velocidad;
		
	}
}
