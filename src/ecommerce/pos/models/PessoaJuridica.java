package ecommerce.pos.models;

public class PessoaJuridica extends Pessoa implements IPessoaAutenticavel {

	public PessoaJuridica(int codigo, String razaosocial, String nomefantasia, String cnpj) {
		super(codigo);
		this.razaosocial = razaosocial;
		this.nomefantasia = nomefantasia;
		this.cnpj = cnpj;
	}
	private String razaosocial;
	private String nomefantasia;
	private String cnpj;
	
	public void mostrardados(){
		super.mostrardados();
		System.out.println("*****************Dados da Pessoa Juricdica***************");
		System.out.println("Raz�o Social: "+ this.razaosocial);
		System.out.println("Nome Fantasia: "+ this.nomefantasia);
		System.out.println("CNPJ: "+ this.cnpj);	
	}
	

	public boolean Autenticacao(String login, String senha)  // Implementa��o de m�todo da interface
	{
		if(login != "clientePJ" && senha != "1234"){
		return false;}
		return true;}
	}
