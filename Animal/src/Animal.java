
public class Animal {
	private String raza;
	private String nombre;
	private int edad;
	private int velocidad=0;
	private String sexo;
	
	public int Acelerar() {
		if (raza=="felino") {
		velocidad+=20;
		}
		else {
			velocidad+=5;
		}
		return velocidad;
	}
}
