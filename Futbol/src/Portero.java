
public class Portero extends Jugador {
private int atrapadas;
	public Portero(String nombre, int numeroDorsal, int golesMarcados,int atrapadas) {
		super(nombre, numeroDorsal, golesMarcados);
		this.atrapadas=atrapadas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int extra() {
		// TODO Auto-generated method stub
		return getGolesMarcados()*30+atrapadas*5;
	}
	public void sumarAtrapadas(int otrasAtrapadas) {
		atrapadas += otrasAtrapadas;
		}

	public String toString() {
		return super.toString() + "\n"+
					"Atrapadas: "+atrapadas;
	}
	public int getAtrapadas() {
		return atrapadas;
	}

	public void setAtrapadas(int atrapadas) {
		this.atrapadas = atrapadas;
	}


	

	

}
