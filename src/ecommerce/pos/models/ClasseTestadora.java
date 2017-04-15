package ecommerce.pos.models;

public class ClasseTestadora {

	public static void main(String[] args) {
		/*PessoaFisicaCliente p1 = new PessoaFisicaCliente(1,"Michel","30","31","32");
		p1.setContato("898","222");
		p1.setEndereco("avenida das garças", 1110, "padre cicero", "petrolina", "PE", "56326000");
		p1.mostrardados();*/
		
		PessoaFisica p1 = new PessoaFisica(1,"Michel","30","31","32");
		Cliente c1 = new Cliente();
		c1.adicionaCliente(p1);
		
		if (c1.Autenticação("cliente", "1234") == true){
			 System.out.println("logado");}
		
	}

}
