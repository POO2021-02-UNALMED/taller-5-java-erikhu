package zooAnimales;
public class Pez extends Animal {
	public Pez(String nombre, int edad, String habitat, String sexo) {
		super(nombre, edad, habitat, sexo);
	}

	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public static int cantidadPeces() {
		return salmones + bacalaos;
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;		
		Animal.totalAnimales++;
		Pez pez = new Pez(nombre, edad,"oceano", genero);
		pez.setColorEscamas("gris");
		pez.setCantidadAletas(6);
		return pez;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		Animal.totalAnimales++;
		Pez pez = new Pez(nombre, edad,"oceano", genero);
		pez.setColorEscamas("gris");
		pez.setCantidadAletas(6);
		return pez;
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
