package ecommerce.pos.models;

public class Produto {
private int codigo;
private String Descricao;
private float valorProduto;
private String genero;
private int qtdProduto;

		public Produto(int codigo, String descricao, float valorProduto, String genero) { // construtor utilizado pela classe itemPedido
			this.codigo = codigo;
			this.Descricao = descricao;
			this.valorProduto = valorProduto;
			this.genero = genero;
		}
		
		public Produto(int codigo, String descricao, float valorProduto, String genero, int qtdProduto) { // construtor utilizado para uma inserção em estoque
			this.codigo = codigo;
			this.Descricao = descricao;
			this.valorProduto = valorProduto;
			this.genero = genero;
			this.qtdProduto = qtdProduto;
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
		public int getqtdProduto() {
			return qtdProduto;
		}
		public void setqtdProduto(int qtdProduto) {
			this.qtdProduto = qtdProduto;
		}
		public void retirarProduto(int qtdretirada){
			this.qtdProduto = this.qtdProduto - qtdretirada;
		}
		public void adicionarProduto(int qtdadicionada){
			this.qtdProduto = this.qtdProduto + qtdadicionada;
		}
}
