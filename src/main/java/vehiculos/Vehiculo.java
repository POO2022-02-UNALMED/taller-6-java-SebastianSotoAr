package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int CantidadVehiculos = 0;
	private static HashMap<Fabricante, Integer> VehiculosPorFabrica = new HashMap<Fabricante, Integer>();

	public Vehiculo() {
		Vehiculo.CantidadVehiculos += 1;
	}

	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio,
			int peso, String traccion, Fabricante fabricante) {
		this();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.agregarFabrica(fabricante);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getCantidad()+"\nCamionestas: "+Camioneta.getCantidad()+"\nCamiones: "+Camion.getCantidad();
	}
	
	public static void agregarFabrica(Fabricante key) {
		Integer num = Vehiculo.VehiculosPorFabrica.get(key);
		if (num == null) {
			Vehiculo.VehiculosPorFabrica.put(key, 1);
		} else {
			Vehiculo.VehiculosPorFabrica.put(key, num + 1);
		}
	}
	
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Vehiculo.VehiculosPorFabrica.values());
		ArrayList<Fabricante> list2 = new ArrayList<Fabricante>(Vehiculo.VehiculosPorFabrica.keySet());
		int max = 0;
		Fabricante fabricanteMax = null;
		for (int i = 0; i < list2.size(); ++i) {
			if (max < list1.get(i)) {
				max = list1.get(i);
				fabricanteMax = list2.get(i);
			}
		}
		return fabricanteMax;
	}	
}
