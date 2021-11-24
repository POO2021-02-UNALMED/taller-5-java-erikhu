package zooAnimales;
public class Ave extends Animal {
	public Ave(String nombre, int edad, String habitat, String sexo) {
		super(nombre, edad, habitat, sexo);
	}
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {}
	public static int cantidadAves() {
		return halcones + aguilas;
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Animal.totalAnimales++;
		halcones++;
		Ave ave = new Ave(nombre, edad,"montanas", genero);
		ave.setColorPlumas("cafe glorioso");
		return ave;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Animal.totalAnimales++;
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
}
