
public class Televisor extends Eletrodomestico{

	
	public int canal;
	public int volume;
	public int numeroCanais;
	public int volumeMax;
	
	public Televisor(boolean k,int c, int v,int total,int vMax) {
		super(k);	
		this.canal = c;
		if(v <= vMax){
		this.volume = v;
		}else this.volume = vMax;
		this.numeroCanais = total;
		this.volumeMax = vMax;
	}
	
	public String DetalhesTelevisor(){
		String k = "Canal: "+canal+"\nVolume: "+volume+"\nTv: "+ligado+"\nVolume Maximo:"+volumeMax;
		k+="\nTotal de Canais: "+numeroCanais;
		return k;
	}
	
	
	public void volumeAcima(){
		if(volumeMax> volume){
			volume++;
			
		}
		
	}
	public void volumeAbaixo(){
		if(volume > -1){
			volume--;		
		}
		
	}
	
	
	public void canalAcima(){
		if(canal> numeroCanais){
			canal = 1;
			
		} else {
			canal++;
		}
		
	}
	public void canalAbaixo(){
		if(canal <= 1){
			canal = numeroCanais;	
		}else canal--;
		
	}

}
