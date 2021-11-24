package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	public Reptil(String nombre, int edad, String habitat, String sexo) {
		super(nombre, edad, habitat, sexo);
		Animal.totalAnimales++;
		reptiles.add(this);
	}

	public Reptil(String nombre, int edad, String habitat, String sexo, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, sexo);
		this.largoCola = largoCola;
		this.colorEscamas = colorEscamas;
		Animal.totalAnimales++;
		reptiles.add(this);
	}
	
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	private static ArrayList<Reptil> reptiles = new ArrayList<Reptil>();
	
	public Reptil() {
		Animal.totalAnimales++;
		reptiles.add(this);
	}
	
	public static int cantidadReptiles() {
		return reptiles.size();
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		Reptil reptil = new Reptil(nombre, edad,"humedal", genero);
		reptil.setColorEscamas("verde");
		reptil.setLargoCola(3);
		return reptil;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		Reptil reptil = new Reptil(nombre, edad,"jungla", genero);
		reptil.setColorEscamas("blanco");
		reptil.setLargoCola(1);
		return reptil;
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
