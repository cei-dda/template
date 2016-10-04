package template;

public abstract class Casilla {
	
	protected TipoCasilla tipo;

	public Casilla(TipoCasilla tipo) {
		this.tipo = tipo;
	}
	
	public abstract int calcularRenta(int dado1, int dado2);

	public int rentaFinal(int dado1, int dado2) {
		int suma = 100;
		// hace cosas
		suma += calcularRenta(dado1, dado2);
		return suma;
	}
	
	public TipoCasilla getTipo() {
		return tipo;
	}

	public void setTipo(TipoCasilla tipo) {
		this.tipo = tipo;
	}

}
