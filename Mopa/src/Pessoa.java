
public class Pessoa {

	public String nome;
  	public String endereco;
	public String telefone;
	
	public Pessoa(String n, String e, String t){
		this.nome = n;
		this.endereco = e;
		this.telefone = t;
	
		
	}
	
	public String dadosPessoas(Pessoa comoassim){
		
		String retorno;
		retorno= "Nome: "+comoassim.nome+"\nEndereço: "+comoassim.endereco+"\nTelefone: "+comoassim.telefone;
		
		return retorno;
	}
	
}
