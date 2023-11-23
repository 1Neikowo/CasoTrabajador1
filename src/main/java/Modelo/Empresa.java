package Modelo;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Trabajador> trabajadores;
	public Empresa() {
		trabajadores = new ArrayList<>();
	}
	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}
	public void addTrabajadores() {
		trabajadores.add(new Trabajador("Pedro", "Sanchez", "8745268-2", "Isapre A", "AFP A"));
		trabajadores.add(new Trabajador("Alberto", "Rodriguez", "21453234-6", "Isapre B", "AFP B"));
		trabajadores.add(new Trabajador("Juana", "Martinez", "6864975-K", "Isapre C", "AFP C"));
		trabajadores.add(new Trabajador("Gerson", "Torres", "2342123-3", "Isapre D", "AFP D"));
	}

}