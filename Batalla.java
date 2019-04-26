import java.util.Scanner;

public class Batalla{
	
	public String inicializarJuego(){
		System.out.println(	"Bienvenido al juego de pokemón de Rolando y Adriana");
		System.out.println(	"***************************************************");
		System.out.println("Instrucciones: ****************************************************+");

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
    	Pocion arrayPociones[] = new Pocion[6];
    	arrayPociones[0] = new Pocion("pocionVida");
    	arrayPociones[1] = new Pocion("pocionVida");
    	arrayPociones[2] = new Pocion("pocionDefensa");
    	arrayPociones[3] = new Pocion("pocionDefensa");
    	arrayPociones[4] = new Pocion("pocionAtaque");
    	arrayPociones[5] = new Pocion("pocionAtaque");

    	System.out.println(" Se te han asignado dos pociones de Vida, dos de Defensa y dos Ataque, use them wisely");
    	
    	Jugador jugador = new Jugador(nombre,arrayPokemon,arrayPociones);

    	return jugador;
	}

public int getTurno(){
		
		turno = contador%2
		if (turno == 0 ){
			System.out.println("Turno de :" + jugador1.getNombre());

		}else{
			System.out.println("Turno de :" + jugador2.getNombre());
		}
		return turno;
}

public void partida(Jugador jugador1, Jugador jugador2){
	turno= getTurno();
	if (turno==1){
		//Le va al jugador 1
		jugarTurno(jugador1, jugador2);
	}
	else if (turno==0){
		//Le va al jugador 2
	}
	else{
		System.out.println("Ha ocurrido un error inesperado, reinicia la partida");
	}
}


public void jugarTurno(Jugador jugador1, Jugador jugador2){
	System.out.println(	"Tus pokemones disponibles son: \n");
	listarPokemonJugador(jugador1);
	System.out.println("Elige tu pokemón para esta partida: ");
	String pokemonJugador1 = scanner.nextLine();

}


public void listarPokemonJugador(Jugador x){

	
	Jugador.getPokemones()
}















/////////////////////////	ESTE METODO VA EN JUEGO //////////////////////////7

//getMultiplicador("Venusaur", "Picachu");

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

