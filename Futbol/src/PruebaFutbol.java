import java.util.Scanner;

public class PruebaFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int op,tam,opTipo,goles,atrapadas,pases,recuperaciones,numDor;
		String nombre;

		boolean disponible;

		Portero p=null;
		Delantero d=null;
		Defensor def=null;

		Jugador j=null;

		System.out.println("Capacidad: ");
		tam=lector.nextInt();

		ControlEquipo control= new ControlEquipo(tam);


		do {
			System.out.println("M E N U");
			System.out.println("1.-Añade un jugador");
			System.out.println("2.-Elimina un jugador");
			System.out.println("3.-Agregar datos");
			System.out.println("4.-Muestra jugadores");
			System.out.println("5.-Salir del sistema");

			op=lector.nextInt();
			switch(op)
			{
			case 1:
				System.out.println("TIPO DE JUGADOR");
				System.out.println("1.-Portero");
				System.out.println("2.-Delantero");
				System.out.println("3.-Defensor");
				opTipo = lector.nextInt();
				System.out.println("Ingrese los datos del jugador");

				System.out.println("Nombre: ");
				nombre = lector.next();

				System.out.println("Numero dorsal: ");
				numDor = lector.nextInt();
				


				switch(opTipo)
				{
				case 1:

					atrapadas=0;
					goles=0;

					p = new Portero(nombre,numDor,goles,atrapadas);
					control.agregarJugador(p);

					break;
				case 2:
					pases=0;
					goles=0;
					recuperaciones=0;

					d = new Delantero(nombre,numDor,goles,pases,recuperaciones);
					control.agregarJugador(d);
					
					break;
				case 3:
					pases=0;
					goles=0;
					recuperaciones=0;

					def = new Defensor(nombre,numDor,goles,pases,recuperaciones);
					control.agregarJugador(def);
					
					
					break;
				}



				break;
			case 2:

				System.out.println("Ingrese los datos del jugador que desea eliminar");



				System.out.println("Nombre: ");
				nombre = lector.next();

				System.out.println("Numero dorsal: ");
				numDor = lector.nextInt();
				


				if(control.despedirJugador(nombre,numDor)==1) {
					System.out.println("Se ha eliminado el jugador");
				}else {
					System.out.println("No se encontro el jugador");

				}

				
				break;
			

			case 3:
				System.out.println("A quien le quiere actualizar un dato 1-Portero....2-Delantero....3-Defensor");
				opTipo = lector.nextInt();

				System.out.println("Ingrese los datos del jugador");

				System.out.println("Nombre: ");
				nombre = lector.next();

				System.out.println("Numero dorsal: ");
				numDor = lector.nextInt();




				switch(opTipo)
				{
				case 1:
					System.out.println("Que dato desea actualizar 1-Gol....2-Atrapada");
					opTipo = lector.nextInt();
					switch(opTipo) {
					case 1:
						System.out.println("Goles: ");
						goles = lector.nextInt();

						int dato1=control.agregarGoles(nombre, numDor, goles);

						if(dato1==1) {
							System.out.println("Se han actualizado los goles");


						}
						else
							System.out.println("No se encontro el jugador");

						break;
					case 2:

						System.out.println("Atrapadas realizadas: ");
						atrapadas = lector.nextInt();

						int contr=control.agregarParadas(nombre, numDor, atrapadas);

						if(contr==1) {
							System.out.println("Se han actualizado las paradas");


							
						}
						else
							System.out.println("No se encontro el jugador");

						break;
					}

				break;
				case 2:
					System.out.println("Que dato desea actualizar 1-Gol....2-Pases....3-Recuperaciones");
					opTipo = lector.nextInt();
					switch(opTipo) {
					case 1:
						System.out.println("Goles: ");
						goles = lector.nextInt();

						int dato1=control.agregarGoles(nombre, numDor, goles);

						if(dato1==1) {
							System.out.println("Se han actualizado los goles");


						}
						else
							System.out.println("No se encontro el jugador");

						break;
					case 2:

						System.out.println("Pases: ");
						pases = lector.nextInt();

						int contr=control.agregarPases(nombre, numDor, pases);

						if(contr==1) {
							System.out.println("Se han actualizado los pases");


						}
						else
							System.out.println("No se encontro el jugador");

						break;
					case 3:

						System.out.println("Recuperaciones: ");
						recuperaciones = lector.nextInt();

						int dato3=control.agregarRecuperaciones(nombre, numDor, recuperaciones);

						if(dato3==1) {
							System.out.println("Se han actualizado las recuperaciones");


						}
						else
							System.out.println("No se encontro el jugador");

						break;
					}


				break;	
				case 3:
					System.out.println("Que dato desea actualizar 1-Gol....2-Pases....3-Recuperaciones");
					opTipo = lector.nextInt();
					switch(opTipo) {
					case 1:
						System.out.println("Goles: ");
						goles = lector.nextInt();

						int dato1=control.agregarGoles(nombre, numDor, goles);

						if(dato1==1) {
							System.out.println("Se han actualizado los goles");


						}
						else
							System.out.println("No se encontro el jugador");

						break;
					case 2:

						System.out.println("Pases: ");
						pases = lector.nextInt();

						int contr=control.agregarPases(nombre, numDor, pases);

						if(contr==1) {
							System.out.println("Se han actualizado los pases");


						}
						else
							System.out.println("No se encontro el jugador");

						break;
					case 3:

						System.out.println("Recuperaciones: ");
						recuperaciones = lector.nextInt();

						int dato3=control.agregarRecuperaciones(nombre, numDor, recuperaciones);

						if(dato3==1) {
							System.out.println("Se han actualizado las recuperaciones");


						}
						else
							System.out.println("No se encontro el jugador");

						break;
					}


				break;

				}
			break;
			case 4:
				System.out.println(control.toString());

				break;
			}
		}while(op!=5);
	}

}
