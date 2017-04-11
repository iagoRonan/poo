package ecommerce.pos.models;

public class PessoaFisica extends Pessoa{

	private String nome;
	private String datanascimento;
	private String rg;
	private String cpf;
	
	public PessoaFisica() {
		super();}
	
	public PessoaFisica(String nome, String datanascimento, String rg, String cpf) {
		super();
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
