public class Pocion{
	public String tipoPocion;

	public void Usarse(Pokemon usuario){
		if (tipoPocion==pocionVida){
			usuario.vida=usuario.vida*1.2;
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