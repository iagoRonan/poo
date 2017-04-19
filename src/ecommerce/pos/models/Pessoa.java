package ecommerce.pos.models;

abstract class Pessoa { //classe abstrata não pode ser instanciada
	
	protected int codigo;
	protected Contato contato; 		// Agregação de Contato é parte de do Todo Pessoa
	protected Endereco endereco; 	// Agregação de Endereço é parte de do Todo Pessoa

	// construtor da classe Pessoa
	public Pessoa(int codigo) {
		this.codigo = codigo;
	}
	
	public Contato getContato() {
		return contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public int getCodigo() {
		return codigo;}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;}
	
	public void AdicionaContato(String telefone, String email){
		this.contato = new Contato(telefone,email);	// instanciando objeto Contato	
	}
	
	public void AdicionaEndereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,estado,cep); // Instanciando Objeto Endereço
		}

	public void mostrardados(){
		System.out.println("Codigo da Pessoa: "+ this.getCodigo());
		System.out.println("******************Dados do contato****************");
		System.out.println(contato.toString());
		System.out.println("********************Dados do endereço**************");
		System.out.println(endereco.toString());
	}




}
