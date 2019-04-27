public class Pokemon {
	String apodo;
	double vida;
	double defensa;
	String estado; //(paralizado, quemado, envenenado, etc.).
	String tipo; //(Agua, Fuego, Hierba y Eléctrico). (4)
	double velocidad;
// GETTERS
	public String getApodo(){
		return apodo;
	}
	public double getVida(){
		return vida;
	}
	public double getDefensa(){
		return defensa;
	}

	public String getEstado(){
		return estado;
	}
	public String getTipo(){
		return tipo;
	}
	public double getVelocidad(){
		return velocidad;
	}
/* Fin de los getters*/ 

/*Método constructor*/
public Pokemon(String apodo, double vida, double defensa, String estado, String tipo, double velocidad){
	this.apodo= apodo;
	this.vida= vida;
	this.defensa= defensa;
	this.estado=estado;
	this.tipo=tipo;
	this.velocidad=velocidad;
}



/*Métodos de Pokemón*/

/*
	public double RecibirDanio(){

	}

	public double  RecibirVidaPocion(){ ///Recibir puntos de vida pociones, de ataque pociones y puntos defensar

	}

	public double RecibirAtaquePocion(){

	}
	public double RecibirDefensaPocion(){

	}

	public double RealizarAtaque1(){

	}

	public double RealizarAtaque2(){
		
	}
*/
public int ListarPokemon(){

Pokemon	arrayPokemon[]= new Pokemon[6];
				arrayPokemon[0]= new Pokemon("Pikachu",100,100,"OK","Electrico",100);
				arrayPokemon[1]= new Pokemon("Bulbasaur",100,100,"OK","Hierba",100);
				arrayPokemon[2]= new Pokemon("Ivysaur",100,100,"OK","Hierba",100);
				arrayPokemon[3]= new Pokemon("Snorlax",100,100,"OK","Normal",100);
				arrayPokemon[4]= new Pokemon("Miau",100,100,"OK","Normal",100);
				arrayPokemon[5]= new Pokemon("Ratata",100,100,"OK","Normal",100);
Pokemon	arrayPokemon2[]= new Pokemon[6];
				arrayPokemon2[0]= new Pokemon("Pikachu",100,100,"OK","Electrico",100);
				arrayPokemon2[1]= new Pokemon("Bulbasaur",100,100,"OK","Hierba",100);
				arrayPokemon2[2]= new Pokemon("Ivysaur",100,100,"OK","Hierba",100);
				arrayPokemon2[3]= new Pokemon("Snorlax",100,100,"OK","Normal",100);
				arrayPokemon2[4]= new Pokemon("Miau",100,100,"OK","Normal",100);
				arrayPokemon2[5]= new Pokemon("Ratata",100,100,"OK","Normal",100);

return 12; //No jala si pongo Void
}

}