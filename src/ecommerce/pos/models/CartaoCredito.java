package ecommerce.pos.models;

public class CartaoCredito extends FormaPagamento {

	private String bandeira;
	private String operação;
	private int QtddVezes;
	private String titular;
	private String validade;
	private String numero;
	private String codigoSegurança;
	
	
	public CartaoCredito(int codPagamento,String bandeira, String operação, int qtddVezes, String titular, String validade, String numero,
			String codigoSegurança){
		super(codPagamento);
		this.bandeira = bandeira;
		this.operação = operação;
		QtddVezes = qtddVezes;
		this.titular = titular;
		this.validade = validade;
		this.numero = numero;
		this.codigoSegurança = codigoSegurança;
	}
	
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public String getOperação() {
		return operação;
	}
	public void setOperação(String operação) {
		this.operação = operação;
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
	public String getCodigoSegurança() {
		return codigoSegurança;
	}
	public void setCodigoSegurança(String codigoSegurança) {
		this.codigoSegurança = codigoSegurança;
	}
	
}
