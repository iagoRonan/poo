/**
 * 
 */
package ecommerce.pos.models;

public class PessoaFisicaCliente extends PessoaFisica implements IPessoaAutenticavel {

	private String senha, login;
	
	public PessoaFisicaCliente(int codigo, String nome, String datanascimento, String rg, String cpf) {
		super(codigo, nome, datanascimento, rg, cpf);
			}

	public boolean Autenticação(String login, String senha)  // Implementação de método da interface
	{
		if(login != "cliente" && senha != "1234"){
		return false;}
		return true;}
	}