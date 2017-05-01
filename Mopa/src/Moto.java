
public class Moto {
public String marca;
public String modelo;
public String cor;
public int marcha;
public boolean ligado;
	

public Moto(String marca, String modelo, String cor){
	this.marca = marca;
	this.modelo = modelo;
	this.cor = cor;
	this.marcha = 0;	
}


public String retornarMoto(){
	String kk;
	if(ligado){
		kk = "Ligada";
	}else kk = "Desligada";
	String k = "Marca: "+marca+"\nModelo: "+modelo+"\nCor: "+cor+"\nMarcha atual: "+retornarMarcha()+"\nMoto "+kk;
	return k;
}


public void marchaMaior(){
	if(marcha < 6 && ligado == true){
		marcha++;		
	}
}

public void marchaMenor(){
	if(marcha>0 && ligado == true){		
		marcha--;
	}
	
}

public void Ligar(){
	if(!ligado){
		this.ligado = true;	
	}
}

public void Desligar(){
	if(ligado){
		this.ligado = false;	
	}
}


private String retornarMarcha(){
	
String k;
	switch (marcha) {
	case 0:
		k = "Neutro";
		break;
case 1:	
	k = "Primeira";
	break;
case 2: 
	k = "Segunda";
	break;
case 3: 
	k="Terceira";
	break;	
case 4: 
	k="Quarta";
	break;		
case 5: 
	k="Quinta";
	break;	
case 6: 
	k="Is Dead";
	break;
	default:
		k = "Marcha invalida";
		break;
	}
	
	
	return k;
}



	
}
