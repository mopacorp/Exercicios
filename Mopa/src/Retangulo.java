
public class Retangulo {


	public int comprimento;
	public int largura;
	public int area;
	public int perimetro;
	
	public Retangulo(int comprimento, int largura){
		this.comprimento = comprimento;
		this.largura = largura;
		calcularArea();
		calcularPerimetro();
		
	}
	
	public void calcularArea(){
		
	this.area = comprimento*largura; 	
		
	}
	
	public void calcularPerimetro(){
		
		this.perimetro = (2*comprimento) + (2*largura);	
			
		}
	
	public String retornaRetangulo(){
		
		String k = "Comprimento: "+comprimento+"\nLargura: "+largura+"\nArea: "+area+"\nPerimetro: "+perimetro;
		return k;
	}
	
	
}
