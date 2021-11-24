package gestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		Iterator<Zona> zonas = this.zonas.iterator();
		while(zonas.hasNext()) {
			Zona zona = zonas.next();
			total += zona.cantidadAnimales();
		}
		return total;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
