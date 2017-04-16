package ecommerce.pos.models;

public class ClasseTestadora {

	public static void main(String[] args) {
		
		Pessoa cliente1 = new PessoaFisica(1,"Michel","30","31","32");
		cliente1.setContato("898","222");
		cliente1.setEndereco("avenida das garças", 1110, "padre cicero", "petrolina", "PE", "56326000");
		
		Pessoa cliente2 = new PessoaJuridica(2,"Tectronic","TECLTDA","10-1009290/0001");
		cliente2.setContato("00000","11111");
		cliente2.setEndereco("avenida do bambu", 878, "joão pio 10", "juazeiro", "BA", "56326000");
		
		
		// criando objetos produtos
		Produto pr1 = new Produto(10, "impressora",250, "Informatica");
		Produto pr2 = new Produto(11, "MicroSystem",550, "Eletros");
		Produto pr3 = new Produto(12, "Faqueiro Ipanema",75, "Cama Mesa e Banho");
		Produto pr4 = new Produto(13, "Mangueira de Jardim",19, "Casa e Jardinagem");
		Produto pr5 = new Produto(14, "Mouse multilaser",25, "Informatica");
		
		// adicionando produtos como itens da lista de pedido
		ItemPedido it1 = new ItemPedido(20,pr1,3);
		ItemPedido it2 = new ItemPedido(21,pr2,1);
		ItemPedido it3 = new ItemPedido(22,pr3,2);
		ItemPedido it4 = new ItemPedido(23,pr4,4);
		ItemPedido it5 = new ItemPedido(24,pr5,1);
		
		// criando um pedido com cliente e numero de itens
		Pedido pd1 = new Pedido(30,cliente1,5);
		
		// adicionando itens a lista de pedido
		pd1.setListaItens(it1,0);
		pd1.setListaItens(it2,1);
		pd1.setListaItens(it3,2);
		pd1.setListaItens(it4,3);
		pd1.setListaItens(it5,4);
				
		cliente1.mostrardados();
		cliente2.mostrardados();
		pd1.mostrarPedido();
		

		
		
		
		//if (p1.Autenticação("cliente", "1234") == true){
			// System.out.println("logado");}
		
	}

}
