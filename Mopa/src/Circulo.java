
public class Circulo {

	public double raio;
	public double area;
	public double perimetro;
	
	public Circulo(double k){
		this.raio = k;
		calcularArea();
		calcularPerimetro();
	}
	
	public void calcularArea(){
		this.area = Math.round( 3.141516 * raio * raio);
	}
	
	public void calcularPerimetro(){
		this.perimetro =Math.round( 2*3.141516*raio);	
	}
	
	public String retornarCirculo(){
		
		String k = "Raio: "+raio+"\nArea "+area+"\nPerimetro "+perimetro;
		return k;
	}
	
	
}
