package ecommerce.pos.models;

abstract class Pessoa { //classe abstrata não pode ser instanciada
	
	protected int codigo;
	protected Contato contato;
	protected Endereco endereco;

	public Contato getContato() {
		return contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Pessoa(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;}
	
	public void setContato(String telefone, String email) {
		this.contato = new Contato(telefone,email);		
	}
	
	public void setEndereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,estado,cep);
		}

	public void mostrardados(){
		System.out.println("Codigo da Pessoa: "+ this.getCodigo());
		System.out.println("******************Dados do contato****************");
		System.out.println("Email: "+ this.contato.getEmail());
		System.out.println("Telefone: "+ this.contato.getTelefone());
		System.out.println("********************Dados do endereço**************");
		System.out.println("Logradouro: "+ this.endereco.getLogradouro());
		System.out.println("Numero: "+ this.endereco.getNumero());
		System.out.println("Bairro: "+ this.endereco.getBairro());
		System.out.println("Cidade: "+ this.endereco.getCidade());
		System.out.println("Estado: "+ this.endereco.getEstado());
		System.out.println("Cep: "+ this.endereco.getCep());
	}




}
