package fvs.edu.br.topicos.domain;

import fvs.edu.br.topicos.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento{
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao () {
		
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
		
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	

	
}
