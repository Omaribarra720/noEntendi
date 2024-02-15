
public abstract class DeCampo extends Jugador {
private int pases,recuperaciones;
	public DeCampo(String nombre, int numeroDorsal, int golesMarcados,int pases,int recuperaciones) {
		super(nombre, numeroDorsal, golesMarcados);
		this.pases=pases;
		this.recuperaciones=recuperaciones;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int extra() {
		// TODO Auto-generated method stub
		return getGolesMarcados()*30 + extra2();
	}
	public abstract int extra2();
	

	public void sumarPases(int pases) {
		pases += pases;
		}
	public void sumarRecuperaciones(int recuperaciones) {
		recuperaciones += recuperaciones;
		}
	
	public String toString() {
		return super.toString() + "\n"+
					"Pases: "+pases+"\n"+
					"Recuperaciones: "+recuperaciones;
	}
	public int getPases() {
		return pases;
	}

	public void setPases(int pases) {
		this.pases = pases;
	}

	public int getRecuperaciones() {
		return recuperaciones;
	}

	public void setRecuperaciones(int recuperaciones) {
		this.recuperaciones = recuperaciones;
	}
	 
}
