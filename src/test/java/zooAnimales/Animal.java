package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	protected static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {}
 	
	public Animal(String nombre, int edad, String habitat, String sexo) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(sexo);
		this.setHabitat(habitat);
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.cantidadMamiferos()+"\n"
				+ "Aves: "+Ave.cantidadAves()+"\n"
				+ "Reptiles: "+Reptil.cantidadReptiles()+"\n"
				+ "Peces: "+ Pez.cantidadPeces();
	}
	
	public String toString() {
	return "Mi nombre es #nombre, tengo una edad de #edad, habito en #habitat y mi genero es\n"
			+ "#genero, la zona en la que me ubico es #zona, en el #zoo";	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
