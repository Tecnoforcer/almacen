package productos;

public final class Agua extends Producto{
	private String origen;

	public Agua(String identificador, double litros, double precio, String marca, String origen,String nombre) {
		super(identificador, litros, precio, marca, origen);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Agua [origen=" + origen + ", identificador=" + identificador + ", litros=" + litros + ", precio="
				+ precio + ", marca=" + marca + "]";
	}
	
	
	
	
	
}
