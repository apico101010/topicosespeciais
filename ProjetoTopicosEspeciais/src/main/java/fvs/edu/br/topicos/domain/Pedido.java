package fvs.edu.br.topicos.domain;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Pedido {

	private Integer id;
	private Date instante;
	
	@ManyToOne
	@JoinColumn(name="endereco_id")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	public Pedido() {
		
	}
	
}
