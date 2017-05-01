
public class Microondas extends Eletrodomestico{

	public Microondas(boolean k) {
		super(k);
		// TODO Auto-generated constructor stub
	}
	public boolean portaFechada;
	
	public String retorneMicroondas(){
		String kk ;
		String porta;
		if(portaFechada){
			porta = "Fechada";
		}
		else porta = "Aberta";
		kk = "Microondas "+this.getLigadoDesligado()+"\nPorta "+porta;	
		return kk;
	}
	
	public void LigarMicroondas(){
		if(this.ligado == false && portaFechada == true) {
			this.ligado = true;
		}
		
		
	}
	
	
	
}
