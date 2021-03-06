package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	public Anfibio(String nombre, int edad, String habitat, String sexo) {
		super(nombre, edad, habitat, sexo);
		Animal.totalAnimales++;
		Anfibio.anfibios.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String sexo, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, sexo);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Animal.totalAnimales++;
		Anfibio.anfibios.add(this);
	}

	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	private static ArrayList<Anfibio> anfibios = new ArrayList<Anfibio>();
	
	public Anfibio() {
		Animal.totalAnimales++;
		Anfibio.anfibios.add(this);
	}
	
	public static int cantidadAnfibios() {
		return Anfibio.anfibios.size();
	}
	
	public static Anfibio crearRana(String nombre, int edad,  String genero) {
		ranas++;
		Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero);
		anfibio.setColorPiel("rojo");
		anfibio.setVenenoso(true);
		return anfibio;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		Anfibio anfibio = new Anfibio(nombre, edad,"selva", genero);
		anfibio.setColorPiel("negro y amarillo");
		anfibio.setVenenoso(false);
		return anfibio;
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
