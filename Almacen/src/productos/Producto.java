package productos;

public abstract class Producto {
	protected String identificador;
	protected double litros;
	protected double precio;
	protected String marca;
	

	public Producto(String identificador, double litros, double precio, String marca) {
		this.identificador = identificador;
		this.litros = litros;
		this.precio = precio;
		this.marca = marca;
	}
	
		public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", litros=" + litros + ", precio=" + precio + ", marca="
				+ marca + "]";
	}

	
	
}
