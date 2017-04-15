package ecommerce.pos.models;

abstract class Pessoa { //classe abstrata não pode ser instanciada
	
	private int codigo;
	private Contato contato;
	private Endereco endereco;

	public Pessoa(int codigo) {
		this.codigo = codigo;
	}
	
	public Pessoa() {
	}
	
	public int getCodigo() {
		return codigo;}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;}
	
	//public Contato getContato() {
		//return contato;}
	
	public void setContato(String telefone, String email) {
		this.contato = new Contato(telefone,email);		
	}
	
	//public Endereco getEndereco() {
		//return endereco;}
	
	public void setEndereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,estado,cep);
		}

	public void mostrardados(){
		System.out.println("Codigo: "+ this.getCodigo());
		System.out.println("contato_email: "+ this.contato.getEmail());
		System.out.println("conatto_telefone: "+ this.contato.getTelefone());
		System.out.println("contato_email: "+ this.contato.getEmail());
		System.out.println("Endereço_logradouro: "+ this.endereco.getLogradouro());
		System.out.println("Endereço_numero: "+ this.endereco.getNumero());
		System.out.println("Endereço_bairro: "+ this.endereco.getBairro());
		System.out.println("Endereço_cidade: "+ this.endereco.getCidade());
		System.out.println("Endereço_estado: "+ this.endereco.getEstado());
		System.out.println("Endereço_cep: "+ this.endereco.getCep());
		System.out.println("_____________________________________ ");
	}




}
