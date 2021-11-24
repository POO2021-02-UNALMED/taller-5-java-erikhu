package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	public Mamifero(String nombre, int edad, String habitat, String sexo) {
		super(nombre, edad, habitat, sexo);
		Animal.totalAnimales++;
		mamiferos.add(this);
	}
	public Mamifero(String nombre, int edad, String habitat, String sexo, boolean pelaje, int patas) {
		super(nombre, edad, habitat, sexo);
		this.pelaje = pelaje;
		this.patas = patas;
		Animal.totalAnimales++;
		mamiferos.add(this);
	}
	
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	private static ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();
	
	public Mamifero() {
		Animal.totalAnimales++;
		mamiferos.add(this);
	}
	public static int cantidadMamiferos() {
		return mamiferos.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		Mamifero mamifero = new Mamifero(nombre, edad,"pradera", genero);
		mamifero.setPelaje(true);
		mamifero.setPatas(4);
		return mamifero;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		Mamifero mamifero = new Mamifero(nombre, edad,"selva", genero);
		mamifero.setPelaje(true);
		mamifero.setPatas(4);
		return mamifero;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
}
