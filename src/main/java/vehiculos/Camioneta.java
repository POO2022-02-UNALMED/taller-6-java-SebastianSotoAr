package vehiculos;

class Camioneta extends Vehiculo{
	private boolean volco;
	private static int Cantidad = 0;

	public Camioneta() {Camioneta.Cantidad += 1;}

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.Cantidad += 1;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidad() {
		return Cantidad;
	}
	
}
