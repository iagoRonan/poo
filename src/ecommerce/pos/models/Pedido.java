package ecommerce.pos.models;

public class Pedido {

	private int codPedido;
	private Pessoa cliente;
	private ItemPedido Itens[];
	private float valorTotal;
	
	public Pedido(int codPedido, Pessoa cliente, int qtd) {
		this.codPedido = codPedido;
		this.cliente = cliente;
		Itens = new ItemPedido[qtd];
	}

	public int getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public ItemPedido[] getListaItens() {
		return Itens;
	}

	public void setListaItens(ItemPedido Itens, int posicao) {
		this.Itens[posicao] = Itens;
	}
	
	
	public float getValorTotal() {
		this.valorTotal = 0;
		for (int x=0;x<5;x++){
		this.valorTotal = this.valorTotal + this.Itens[x].getsubtotal();}
		return valorTotal;
	}


	public void mostrarPedido(){
		System.out.println("<--------------- FOLHA DE PEDIDO ------------->");
		System.out.println("Codigo do pedido: "+ this.codPedido);
		System.out.println("Dados do cliente: -------------");
		System.out.println("Codigo do cliente: "+ this.cliente.codigo);
		System.out.println("Endereco do cliente: "+ this.cliente.endereco.getLogradouro());
		System.out.println("Contato do cliente: "+ this.cliente.contato.getTelefone());
		System.out.println("Dados do pedido: -------------");
		System.out.print("Itens: "+ this.Itens[0].getProduto().getDescricao() + "---- ");
		System.out.println("subtotal: "+ this.Itens[0].getsubtotal());
		System.out.print("Itens: "+ this.Itens[1].getProduto().getDescricao()+ "---- ");
		System.out.println("subtotal: "+ this.Itens[1].getsubtotal());
		System.out.print("Itens: "+ this.Itens[2].getProduto().getDescricao()+ "---- ");
		System.out.println("subtotal: "+ this.Itens[2].getsubtotal());
		System.out.print("Itens: "+ this.Itens[3].getProduto().getDescricao()+ "---- ");
		System.out.println("subtotal: "+ this.Itens[3].getsubtotal());
		System.out.print("Itens: "+ this.Itens[4].getProduto().getDescricao()+ "---- ");
		System.out.println("subtotal: "+ this.Itens[4].getsubtotal());
		System.out.println("Total: "+ this.getValorTotal());
	}
}
