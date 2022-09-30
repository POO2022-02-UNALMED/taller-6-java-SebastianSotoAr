package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static HashMap<String, Integer> VehiculosPorPais = new HashMap<String, Integer>();

	public Fabricante() {}

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.agregarPais(pais.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static void agregarPais(String key) {
		Integer num = Fabricante.VehiculosPorPais.get(key);
		if (num == null) {
			Fabricante.VehiculosPorPais.put(key, 1);
		} else {
			Fabricante.VehiculosPorPais.put(key, num + 1);
		}
	}
	
	public static String paisMayorVentas() {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Fabricante.VehiculosPorPais.values());
		ArrayList<String> list2 = new ArrayList<String>(Fabricante.VehiculosPorPais.keySet());
		int max = 0;
		String nombreMax = "";
		for (int i = 0; i < list2.size(); ++i) {
			if (max < list1.get(i)) {
				max = list1.get(i);
				nombreMax = list2.get(i);
			}
		}
		return nombreMax;
	}
	
	public static String fabricaMayorVentas() {
		return Vehiculo.fabricaMayorVentas();
	}
}
