
public class Delantero extends DeCampo {

	public Delantero(String nombre, int numeroDorsal, int golesMarcados, int pases, int recuperaciones) {
		super(nombre, numeroDorsal, golesMarcados, pases, recuperaciones);
		
		
		
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public int extra2() {
		// TODO Auto-generated method stub
		return getPases()*2+getRecuperaciones()*3;
	}

}
