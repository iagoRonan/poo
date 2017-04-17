package ecommerce.pos.models;

public class FormaPagamento {

	private int codPagamento;
	private String dataPagamento;
	
	
	public FormaPagamento(int codPagamento) {
		this.codPagamento = codPagamento;
	}
	

	public int getCodPagamento() {
		return codPagamento;
	}
	public void setCodPagamento(int codPagamento) {
		this.codPagamento = codPagamento;
	}
	
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	
	
}
