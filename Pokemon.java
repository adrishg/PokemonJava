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


/////////////////////////	ESTE METODO VA EN JUEGO //////////////////////////7

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

}