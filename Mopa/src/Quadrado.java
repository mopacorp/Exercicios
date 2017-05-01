
public class Quadrado {

	public int lado;
	public int area;
	public int perimetro;
	
	public Quadrado(int lado) {
		this.lado = lado;
		calcularArea();
		calcularPerimetro();
	}
	
	public void calcularArea(){
		
		this.area = lado*lado;
		
	}
	
	public void calcularPerimetro(){
		
		this.perimetro = 4*lado;
		
	}
	public String retornaQuadrado(){
		
		String k = "Lado: "+lado+"\nArea:"+area+"\nPerimetro: "+perimetro;
	
		
		return k;
	}
	
	
	
	
	
}
