


public class ControlEquipo {
private Jugador[] arreglo;
	
	public ControlEquipo(int size)
	{
		arreglo = new Jugador[size]; //  crear el arreglo de tamaño size
	}
	
	public int buscarDisponible()
	{
		int i=0;
		while(i<arreglo.length && arreglo[i]!=null)
			i++;
		
		return (i==arreglo.length)? -1:i;
		
	}
	
	public void agregarJugador(Jugador p)
	{
		int i= buscarDisponible();
		if(i!=-1)
		{
			arreglo[i]=p;
		}
	}
	

	
	
	
	public int buscarJugador (String nombre, int numeroDorsal)
	{
		int i=0;
		while(i<arreglo.length && (arreglo[i]==null || !(arreglo[i].getNombre().equals(nombre) &&
														arreglo[i].getNumeroDorsal()==(numeroDorsal) )))
			i++;
		
		return (i==arreglo.length)?-1:i;
	}
	/*
	public Empleado buscarEmpleado (String DNI, String nombre, int sueldoBase,int productividad)
	{
		int i=0;
		while(i<arreglo.length && (arreglo[i]==null || !(arreglo[i].getDNI().equals(DNI) &&
														arreglo[i].getNombre().equals(nombre)&& 
														arreglo[i].getSueldoBase()==(sueldoBase)&& 
														arreglo[i].getProductividad()==(productividad))))
			i++;
		
		return (i==arreglo.length)? null:arreglo[i];
	}*/
	
	
	public int despedirJugador (String nombre, int numeroDorsal)
	{
		
		int i=0;
		while(i<arreglo.length && (arreglo[i]==null || !(
														arreglo[i].getNombre().equals(nombre)&& 
														arreglo[i].getNumeroDorsal()==(numeroDorsal) )))
														
		{
			i++;
			
		}
		if(i!=arreglo.length)
		{
			arreglo[i]=null;
		}
		if(i==arreglo.length) {
			return -1;
		}
		else {
			return 1;
		}
		
	}
	



	public int agregarParadas(String nombre, int numeroDorsal, int atrapadas) {
		Portero aux;
		int i = buscarJugador(nombre, numeroDorsal);
		if(i != -1 && arreglo[i].getClass() == Portero.class) {
			aux = (Portero) arreglo[i];
			aux.sumarAtrapadas(atrapadas);
			return 1;
		}
		return 0;
	}
	public int agregarGoles(String nombre, int numeroDorsal,int goles) {
		Jugador aux;
		int i = buscarJugador(nombre,numeroDorsal);
		if(i != -1 && arreglo[i].getClass() ==Delantero.class || arreglo[i].getClass() ==Portero.class || arreglo[i].getClass() ==Defensor.class) {
			aux = (Jugador) arreglo[i];
			aux.sumarGoles(goles);;
			return 1;
		}
		return 0;
	}
	public int agregarPases(String nombre, int numeroDorsal, int pases) {
		DeCampo aux;
		int i = buscarJugador(nombre, numeroDorsal);
		if(i != -1 && arreglo[i].getClass() ==Defensor.class || arreglo[i].getClass() ==Delantero.class) {
			aux = (DeCampo) arreglo[i];
			aux.sumarPases(pases);;
			return 1;
		}
		return 0;
	}
	public int agregarRecuperaciones(String nombre, int numeroDorsal, int recuperaciones) {
		DeCampo aux;
		int i = buscarJugador(nombre, numeroDorsal);
		if(i != -1 && arreglo[i].getClass() == Defensor.class || arreglo[i].getClass() ==Delantero.class) {
			aux = (DeCampo) arreglo[i];
			aux.sumarRecuperaciones(recuperaciones);
			return 1;
		}
		return 0;
	}
	


	
	
	public String toString()
	{
		String cadena="";
		
		for(int i=0;i<arreglo.length;i++)
		{
			if(arreglo[i]!=null)
				cadena+=arreglo[i].toString()+"\n";
		}
		return cadena;
	}
	/*
	public String toStringJardinero()
	{
		String cadena="";
		
		for(int i=0;i<arreglo.length;i++)
		{
			if(arreglo[i]!=null && arreglo[i].getClass()==Jardinero.class)
				cadena+=arreglo[i].toString()+"\n";
		}
		return cadena;
	}*/
}