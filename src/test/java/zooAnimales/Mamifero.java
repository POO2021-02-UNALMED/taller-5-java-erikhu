package zooAnimales;
public class Mamifero extends Animal {
	public Mamifero(String nombre, int edad, String habitat, String sexo) {
		super(nombre, edad, habitat, sexo);
	}
	
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {}
	public static int cantidadMamiferos() {
		return leones + caballos;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Animal.totalAnimales++;
		caballos++;
		Mamifero mamifero = new Mamifero(nombre, edad,"pradera", genero);
		mamifero.setPelaje(true);
		mamifero.setPatas(4);
		return mamifero;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Animal.totalAnimales++;
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
