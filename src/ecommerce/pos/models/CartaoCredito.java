package ecommerce.pos.models;

public class CartaoCredito extends FormaPagamento {

	private String bandeira;
	private String opera��o;
	private int QtddVezes;
	private String titular;
	private String validade;
	private String numero;
	private String codigoSeguran�a;
	
	
	public CartaoCredito(int codPagamento,String bandeira, String opera��o, int qtddVezes, String titular, String validade, String numero,
			String codigoSeguran�a){
		super(codPagamento);
		this.bandeira = bandeira;
		this.opera��o = opera��o;
		QtddVezes = qtddVezes;
		this.titular = titular;
		this.validade = validade;
		this.numero = numero;
		this.codigoSeguran�a = codigoSeguran�a;
	}
	
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public String getOpera��o() {
		return opera��o;
	}
	public void setOpera��o(String opera��o) {
		this.opera��o = opera��o;
	}
	public int getQtddVezes() {
		return QtddVezes;
	}
	public void setQtddVezes(int qtddVezes) {
		QtddVezes = qtddVezes;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCodigoSeguran�a() {
		return codigoSeguran�a;
	}
	public void setCodigoSeguran�a(String codigoSeguran�a) {
		this.codigoSeguran�a = codigoSeguran�a;
	}
	
}
