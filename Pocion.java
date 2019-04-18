public class Pocion{
	public String tipoPocion;

	public void Usarse(){
		if (tipoPocion==pocionVida){
			vida=vida*1.2;
			/////////////////////////////////////
		}
		else if(tipoPocion==pocionAtaque){
			ataque=ataque*1.1;
			///////////////////////////////////
		}
		else if(tipoPocion==pocionDefensa){
			defensa=defensa*1.1;
			/////////////////////////////////////
		}

	}
}