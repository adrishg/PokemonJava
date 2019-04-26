public class Jugador{
	public String nombre;
	public Pocion[] pociones;
	public Pokemon[] pokemones;

	//Constructor
	public Jugador (String nombre, Pocion[] pociones, Pokemon[] pokemones){
		this.nombre=nombre;
		this.pociones=pociones;
		this.pokemones=pokemones;
	} 


	public String getNombre(){
		return nombre;
	}

	public char getPokemones()
	{
		return pokemones;
	}

	public char getPociones(){
		return pociones;
	}

	public int GuardarPokemon(){

	}

	public int ElegirPokemon(){

	}

	public int UsarPoción(){

	}

	public int ListarPokemon(){


		for (int i=1;i<5 ;i++ ) {
			
		System.out.println(pokemones[i].getApodo());
		System.out.println(pokemones[i].getEstado());
		System.out.println(pokemones[i].getVida());


		}

		
	} 
}


//??????????
/*public int PocionVida(){
		pokemon.vida=pokemon.vida*.20;
	}

*/