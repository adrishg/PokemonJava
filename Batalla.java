public class Batalla{
	
	public String inicializarJuego(){
		System.out.println(	"Bienvenido al juego de pokemón de Rolando y Adriana");
		System.out.println(	"***************************************************");

		System.out.println(	"Jugador1, favor de ingresar tus datos");
		Jugador jugador1 = datosCompletos();
		System.out.println(	"Jugador2, favor de ingresar tus datos");
		Jugador jugador2 = datosCompletos();

	}


	public Jugador datosCompletos(){
    	System.out.println("Nombre:");
    	String nombre = scanner.nextLine();
    	System.out.println(" Ahora deberás elegir seis pokemón para jugar");
    	System.out.println(	"Los pokemón disponibles son: ");
    	ListarPokemon();
    	for(int i=0; i<6 ; i++){  //Esto es para que se eligan 6 pokemón
    		System.out.println("Ingresa tu pokemón número "+i+" :");
    		arrayPokemon.add(pokemonTotal.get(scanner.nextLine()));
    	}
    	//arrayPociones=inicializarPociones();
    	//Al iniciar el juego, cada Jugador tendra 2 pociones de cada tipo.
    	arrayPociones.add(new Pocion("Vida"));
    	arrayPociones.add(new Pocion("Vida"));
    	arrayPociones.add(new Pocion("Defensa"));
    	arrayPociones.add(new Pocion("Defensa"));
    	arrayPociones.add(new Pocion("Ataque"));
    	arrayPociones.add(new Pocion("Ataque"));

    	System.out.println(" Se te han asignado dos pociones de Vida, dos de Defensa y dos Ataque, use them wisely");
    	
    	Jugador jugador = new Jugador(nombre,arrayPokemon,arrayPociones);

    	return jugador;
	}


	public int turno(){
		
		turno = contador%2
		if (turno == 0 ){
			System.out.println("Turno de :" + jugador1.getNombre());

		}else{
			System.out.println("Turno de :" + jugador2.getNombre());
		}
}








/////////////////////////	ESTE METODO VA EN JUEGO //////////////////////////7

getMultiplicador("Venusaur", "Picachu");

	public float getMultiplicadorElemental(Pokemon atacante, Pokemon atacado ){
		if (atacante.tipo=="Fuego"){
			//• Fuego: x2 de daño a tipo Hierba, x0.5 a tipo Agua o Fuego, x1 a otro tipo.
			if(atacado.tipo=="Hierba"){
				multiplicador=2;
			}
			else if ((atacado.tipo=="Agua") || (atacado.tipo=="Fuego"))
			{
				multiplicador=.5;
			}
			else{
				multiplicador=1;
			}

		}
		else if (atacante.tipo=="Agua"){
			//• Agua: x2 de daño a tipo Fuego, x0.5 a tipo Agua o Hierba, x1 a otro tipo.
			if(atacado.tipo=="Fuego"){
				multiplicador=2;
			}
			else if ((atacado.tipo=="Agua") || (atacado.tipo=="Hierba"))
			{
				multiplicador=.5;
			}
			else{
				multiplicador=1;
			}


		}
		else if(atacante.tipo=="Hierba"){
			//• Hierba: x2 de daño a tipo Agua, x0.5 a tipo Hierba o Fuego, x1 a otro tipo.
			if(atacado.tipo=="Agua"){
				multiplicador=2;
			}
			else if ((atacado.tipo=="Hierba") || (atacado.tipo=="Fuego"))
			{
				multiplicador=.5;
			}
			else{
				multiplicador=1;
			}

		}
		else if(atacante.tipo="Electrico"){
			//• Eléctrico: x2 de daño a tipo Agua, x0.5 a tipo Hierba o Eléctrico, x1 a otro tipo.
			if(atacado.tipo=="Agua"){
				multiplicador=2;
			}
			else if ((atacado.tipo=="Hierba") || (atacado.tipo=="Electrico"))
			{
				multiplicador=.5;
			}
			else{
				multiplicador=1;
			}

		}
		return multiplicador;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	}

}