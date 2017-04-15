package ecommerce.pos.models;

public class ClasseTestadora {

	public static void main(String[] args) {
		/*PessoaFisicaCliente p1 = new PessoaFisicaCliente(1,"Michel","30","31","32");
		p1.setContato("898","222");
		p1.setEndereco("avenida das garças", 1110, "padre cicero", "petrolina", "PE", "56326000");
		p1.mostrardados();*/
		
		Pessoa p1 = new PessoaFisica(1,"Michel","30","31","32");
		p1.setContato("898","222");
		p1.setEndereco("avenida das garças", 1110, "padre cicero", "petrolina", "PE", "56326000");
		
		Pessoa p2 = new PessoaJuridica(2,"Tectronic","TECLTDA","10-1009290/0001");
		p2.setContato("00000","11111");
		p2.setEndereco("avenida do bambu", 878, "joão pio 10", "juazeiro", "BA", "56326000");
		
		p1.mostrardados();
		p2.mostrardados();
		
		//if (p1.Autenticação("cliente", "1234") == true){
			// System.out.println("logado");}
		
	}

}
