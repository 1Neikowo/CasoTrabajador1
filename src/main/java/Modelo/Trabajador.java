package Modelo;

public class Trabajador extends Persona {

	private String isapre;
	private String afp;

	public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.isapre = isapre;
		this.afp = afp;
	}
	public String datosTrabajador(){
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", RUT: " + rut +
				", Isapre: " + isapre + ", AFP: " + afp;
	}

}