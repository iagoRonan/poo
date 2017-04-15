/**
 * 
 */
package ecommerce.pos.models;

import java.util.ArrayList;

public class Cliente implements IPessoaAutenticavel {

	private static ArrayList<Pessoa> listaDeClientes = new ArrayList<Pessoa>();
	
	// Aqui entra um dos conceitos de polimorfismo... estamos pedindo pra receber uma pessoa aqui. Uma PessoaFisica é uma Pessoa?
			// E uma Pessoa Juridica é uma Pessoa? No nosso caso sim!

	public void adicionaCliente(Pessoa p) { 
				listaDeClientes.add(p);
	}	
	public ArrayList<Pessoa> getListaDeClientes() {
		return listaDeClientes;
	}
	
	
	
	
	
	
	
	
	public boolean Autenticação(String login, String senha)  // Implementação de método da interface
	{
		if(login != "cliente" && senha != "1234"){
		return false;}
		return true;}
	}