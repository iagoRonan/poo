package ecommerce.pos.models;

public class Pedido {

	private int codPedido;
	private Pessoa cliente;
	private ItemPedido Itens[];
	private FormaPagamento pagamento;
	private float valorTotal;
	
	public Pedido(int codPedido, Pessoa cliente, int qtd) {
		this.codPedido = codPedido;
		Itens = new ItemPedido[qtd];
		this.cliente = cliente;
		}
	
	public FormaPagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
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

	public void AdicionandoItemLista(ItemPedido Itens, int posicao) {
		this.Itens[posicao] = Itens;
	}
	
	
	public float CalculoValorTotal() {
		this.valorTotal = 0;
		for (int x=0;x<Itens.length;x++){
		this.valorTotal = this.valorTotal + this.Itens[x].getsubtotal();}
		return valorTotal;
	}


	public void mostrarPedido(){
		System.out.println("<------------------------------- FOLHA DE PEDIDO ----------------------------->");
		System.out.println("Codigo do pedido: "+ this.codPedido);
		System.out.println("<----------------------------Dados do cliente: ------------------------------>");
		cliente.mostrardados();
		System.out.println("<-----------------------------Dados do pedido: ------------------------------>");
		for (int x=0;x<Itens.length;x++){	
			System.out.print("Itens: "+ this.Itens[x].getProduto().getDescricao() + "---- ");
			System.out.println("subtotal: "+ this.Itens[x].getsubtotal());
			}
		System.out.println("Total: "+ this.CalculoValorTotal());
		System.out.println("<---------------------------Dados Forma de Pagamento: ----------------------->");
		System.out.println("Codigo do Pagamento: "+ pagamento.toString());
		
	}
}
