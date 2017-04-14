package ecommerce.pos.models;

public class Pessoa {
private int codigo;
private Contato contato;
private Endereco endereco;

public Pessoa(int codigo, Contato contato, Endereco endereco) {
	super();
	contato = new Contato();
	endereco = new Endereco();
	this.codigo = codigo;
	this.contato = contato;
	this.endereco = endereco;
}

public Pessoa() {

}






}
