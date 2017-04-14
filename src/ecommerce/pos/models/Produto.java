package ecommerce.pos.models;

public class Produto {
private int codigo;
private String Descricao;
private float valorProduto;
private String genero;
private int quantidade;

public Produto(int codigo, String descricao, float valorProduto, String genero, int quantidade) {
	super();
	this.codigo = codigo;
	Descricao = descricao;
	this.valorProduto = valorProduto;
	this.genero = genero;
	this.quantidade = quantidade;
}

public Produto() {
	super();
	// TODO Auto-generated constructor stub
}

public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getDescricao() {
	return Descricao;
}
public void setDescricao(String descricao) {
	Descricao = descricao;
}
public float getValorProduto() {
	return valorProduto;
}
public void setValorProduto(float valorProduto) {
	this.valorProduto = valorProduto;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}






}
