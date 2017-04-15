package ecommerce.pos.models;

public class PessoaFisicaFuncinario extends PessoaFisica implements IPessoaAutenticavel{
	
	private int carteiratrabalho;
	
		
	public PessoaFisicaFuncinario(int codigo, String nome, String datanascimento, String rg, String cpf, int carteiratrabalho)
	{
		super(codigo, nome, datanascimento, rg, cpf);
		this.carteiratrabalho = carteiratrabalho;
	}

	
	public int getCarteiratrabalho() {
		return carteiratrabalho;
	}
	public void setCarteiratrabalho(int carteiratrabalho) {
		this.carteiratrabalho = carteiratrabalho;
	}


	public boolean Autenticação(String login, String senha)  // Implementação de método da interface
	{
		if(login != "cliente" && senha != "1234"){
		return false;}
		return true;}
	}

