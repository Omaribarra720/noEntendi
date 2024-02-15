
public abstract class Jugador {

	private String nombre;
	private int numeroDorsal, golesMarcados;
	
	public Jugador(String nombre, int numeroDorsal, int golesMarcados) {
		this.nombre = nombre;
		this.numeroDorsal = numeroDorsal;
		this.golesMarcados=golesMarcados;
		//golesMarcados = 0;
	}
	
	public int valoracion() {
		return  extra();
	}
	public void sumarGoles(int goles) {
		golesMarcados += goles;
		}
	public abstract int extra();
	
	public String toString() {
		return "Nombre: "+nombre + "\n"+
				
				"Numero dorsal: " + numeroDorsal + "\n"+
				"Valoracion: "+valoracion() + "\n"+
				"Goles: " + golesMarcados ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDorsal() {
		return numeroDorsal;
	}

	public void setNumeroDorsal(int numeroDorsal) {
		this.numeroDorsal = numeroDorsal;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	
}
