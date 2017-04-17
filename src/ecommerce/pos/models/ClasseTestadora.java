package ecommerce.pos.models;

public class ClasseTestadora {

	public static void main(String[] args) {
		
		// criando cliente pessoa Fisica
		Pessoa PF1 = new PessoaFisica(1,"Michel","30","31","32");
		PF1.setContato("898","222");
		PF1.setEndereco("avenida das garças", 1110, "padre cicero", "petrolina", "PE", "56326000");
		
		// criando cliente pessoa Juridica
		Pessoa PJ1 = new PessoaJuridica(2,"Tectronic","TECLTDA","10-1009290/0001");
		PJ1.setContato("00000","11111");
		PJ1.setEndereco("avenida do bambu", 878, "joão pio 10", "juazeiro", "BA", "56326000");

		/*Cliente c = new Cliente();
		c.setListaItens(PF1, 1);
		c.setListaItens(PF2,2);	*/
		
		// criando um pedido com cliente e numero de itemens
		Pedido pedido1 = new Pedido(30,PJ1,6);
				
		
		// criando objetos produtoodutos
		Produto produto1 = new Produto(10, "impressora",250, "Informatica");
		Produto produto2 = new Produto(11, "MicroSystem",550, "Eletros");
		Produto produto3 = new Produto(12, "Faqueiro Ipanema",75, "Cama Mesa e Banho");
		Produto produto4 = new Produto(13, "Mangueira de Jardim",19, "Casa e Jardinagem");
		Produto produto5 = new Produto(14, "Mouse multilaser",25, "Informatica");
		
		// adicionando produtoodutos como itemens da lista de pedido
		ItemPedido item1 = new ItemPedido(20,produto1,3);
		ItemPedido item2 = new ItemPedido(21,produto2,1);
		ItemPedido item3 = new ItemPedido(22,produto3,2);
		ItemPedido item4 = new ItemPedido(23,produto4,4);
		ItemPedido item5 = new ItemPedido(24,produto5,1);
		
		
		// adicionando itemens a lista de pedido
		pedido1.setListaItens(item1,0);
		pedido1.setListaItens(item2,1);
		pedido1.setListaItens(item3,2);
		pedido1.setListaItens(item4,3);
		pedido1.setListaItens(item5,4);
		pedido1.setListaItens(item1,5);
		
		// algumas forma de pagamento
		FormaPagamento Pagamento1 = new CartaoCredito(1,"visa","credito", 3, "Mariano Ribeiro", "10/10/23", "54212345212","132");
		FormaPagamento Pagamento2 = new CartaoCredito(2,"mastercard","debito", 1, "Juliana Marinalva", "12/09/29", "232356789","787");
		FormaPagamento Pagamento3 = new Boleto(3,"19/04/2017","12345678912","Sanatander");
		FormaPagamento Pagamento4 = new Boleto(4,"20/04/2017","12232344423","Banco do Brasil");
		
		//forma de pagamento para o pedido 1
		pedido1.setPagamento(Pagamento1);

		// Mostrar dados
		PF1.mostrardados();
		PJ1.mostrardados();
		pedido1.mostrarPedido();
		
		
		
	}

}
