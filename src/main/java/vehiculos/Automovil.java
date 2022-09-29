package vehiculos;

class Automovil extends Vehiculo{
	private int puestos;
	private static int Cantidad = 0;

	public Automovil() {Automovil.Cantidad += 1;}

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante,
			int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automovil.Cantidad += 1;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidad() {
		return Cantidad;
	}
	
}
