public class Pocion{
	public String tipoPocion; //Vida,Defensa,Ataque

	public Pocion(String tipoPocion){
		this.tipoPocion = tipoPocion;
	}

	public String getTipoPocion(){
		return tipoPocion;
	}
	public void BorrarPocionUsada(Pokemon usadorPocion, Pocion posionUsandose){
		String aBorrar = pocionUsandose.getTipoPocion()
			for(int indice=0; indice<ArrayList2.size(); indice++){
 				if(pociones.get(indice).contains(aBorrar)){
					String borraEsto=pociones.get(indice);
						pociones.usadorPocion.remove(borraEsto);
					}
				}
	}

	public void Usarse(Pokemon usadorPocion/*, Pokemon targetPoke*/, Pocion pocionUsandose){
		if (tipoPocion.usadorPocion==pocionVida){
			vida=vida*1.2;
			BorrarPocionUsada(usadorPocion, pocionUsandose);
			/////////////////////////////////////
		}
		else if(tipoPocion==pocionAtaque){
			ataque.usadorPocion=ataque*1.1;
			BorrarPocionUsada(usadorPocion, pocionUsandose);
			///////////////////////////////////
		}
		else if(tipoPocion==pocionDefensa){
			defensa.usadorPocion=defensa*1.1;
			BorrarPocionUsada(usadorPocion, pocionUsandose);
			/////////////////////////////////////
		}

	}
}