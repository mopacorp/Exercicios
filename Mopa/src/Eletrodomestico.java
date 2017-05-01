
public class Eletrodomestico {

	public boolean ligado;
	public Eletrodomestico(boolean k){
		this.ligado =k;
		
	}
	
	public String getLigadoDesligado(){
		String k;
		if(ligado){
			k = "Ligado";
		}else k= "Desligado";
		return k;
		
	}
	public void Ligar(){
		if(!ligado){
			ligado = true;	
		}
	}
	public void Desligar(){
		
		if(ligado){
			ligado = false;
		}
	}
	
	
}
