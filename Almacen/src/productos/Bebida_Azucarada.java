package productos;

public final class Bebida_Azucarada extends Producto{
	private boolean oferta;

	public Bebida_Azucarada(String identificador, double litros, double precio, String marca, boolean oferta,String nombre) {
		super(identificador, litros, precio, marca, nombre);
		this.oferta = oferta;
	}

	public boolean isOferta() {
		return oferta;
	}

	public void setOferta(boolean oferta) {
		this.oferta = oferta;
	}

	
	@Override
	public String toString() {
		return "Bebida_Azucarada [oferta=" + oferta + ", identificador=" + identificador + ", litros=" + litros
				+ ", precio=" + precio + ", marca=" + marca + ", nombre=" + nombre + "]";
	}

	public double enOferta() {
		
		if (oferta)
			return (precio*0.9);
		return precio;
	}
	
	
	
}
