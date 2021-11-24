package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	public Ave(String nombre, int edad, String habitat, String sexo) {
		super(nombre, edad, habitat, sexo);
		Animal.totalAnimales++;
		Ave.aves.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String sexo, String colorPlumas) {
		super(nombre, edad, habitat, sexo);
		this.colorPlumas = colorPlumas;
		Ave.aves.add(this);
		Animal.totalAnimales++;
	}
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	private static ArrayList<Ave> aves = new ArrayList<Ave>();
	
	public Ave() {
		Animal.totalAnimales++;
		Ave.aves.add(this);
	}
	public static int cantidadAves() {
		return Ave.aves.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		Ave ave = new Ave(nombre, edad,"montanas", genero);
		ave.setColorPlumas("cafe glorioso");
		return ave;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		Ave ave = new Ave(nombre, edad,"montanas", genero);
		ave.setColorPlumas("blanco y amarillo");
		return ave;
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	@Override
	public String toString() {
		return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+" y mi genero es "
				+ this.getGenero();	
		}
}
