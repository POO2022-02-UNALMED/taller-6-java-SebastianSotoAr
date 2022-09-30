package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static HashMap<Pais, Integer> VehiculosPorPais = new HashMap<Pais, Integer>();

	public Fabricante() {}

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.agregarPais(pais);
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
	
	public static void agregarPais(Pais key) {
		Integer num = Fabricante.VehiculosPorPais.get(key);
		if (num == null) {
			Fabricante.VehiculosPorPais.put(key, 1);
		} else {
			Fabricante.VehiculosPorPais.put(key, num + 1);
		}
	}
	
	public static Pais paisMasVendedor() {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Fabricante.VehiculosPorPais.values());
		ArrayList<Pais> list2 = new ArrayList<Pais>(Fabricante.VehiculosPorPais.keySet());
		int max = 0;
		Pais paisMax = null;
		for (int i = 0; i < list2.size(); ++i) {
			if (max < list1.get(i)) {
				max = list1.get(i);
				paisMax = list2.get(i);
			}
		}
		return paisMax;
	}
	
	public static Fabricante fabricaMayorVentas() {
		return Vehiculo.fabricaMayorVentas();
	}
}
