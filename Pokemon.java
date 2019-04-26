public class Pokemon {
	String apodo;
	float vida;
	float defensa;
	String estado; //(paralizado, quemado, envenenado, etc.).
	String tipo; //(Agua, Fuego, Hierba y Eléctrico). (4)
	float velocidad;
// GETTERS
	public String getApodo(){
		return apodo;
	}
	public float getVida(){
		return vida;
	}
	public float getDefensa(){
		return defensa;
	}

	public String getEstado(){
		return estado;
	}
	public String getTipo(){
		return tipo;
	}
	public float getVelocidad(){
		return velocidad;
	}
/* Fin de los getters*/ 

/*Método constructor*/
public Pokemon(String apodo, float vida, float defensa, String estado, String tipo, float velocidad){
	this.apodo= apodo;
	this.vida= vida;
	this.defensa= defensa;
	this.estado=estado;
	this.tipo=tipo;
	this.velocidad=velocidad;
}

/*Métodos de Pokemón*/

/*
	public float RecibirDanio(){

	}

	public float  RecibirVidaPocion(){ ///Recibir puntos de vida pociones, de ataque pociones y puntos defensar

	}

	public float RecibirAtaquePocion(){

	}
	public float RecibirDefensaPocion(){

	}

	public float RealizarAtaque1(){

	}

	public float RealizarAtaque2(){
		
	}
*/
}