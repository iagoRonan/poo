package ecommerce.pos.models;

abstract class Pessoa {
private int codigo;
private Contato contato;
private Endereco endereco;


public Pessoa(int codigo, Contato contato, Endereco endereco) {
	this.codigo = codigo;
	this.contato = contato;
	this.endereco = endereco;
}

public Pessoa() {
	// TODO Auto-generated constructor stub
}

public int getCodigo() {
	return codigo;}

public void setCodigo(int codigo) {
	this.codigo = codigo;}

public Contato getContato() {
	return contato;}

public void setContato(Contato contato) {
	this.contato = contato;}

public Endereco getEndereco() {
	return endereco;}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;}






}
