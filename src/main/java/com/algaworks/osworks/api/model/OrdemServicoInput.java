package com.algaworks.osworks.api.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrdemServicoInput {

	@Valid
	@NotNull
	private ClienteInputId cliente;
	
	@NotBlank
	private String descricao;
	
	@NotNull
	private BigDecimal preco;

	public ClienteInputId getCliente() {
		return cliente;
	}

	public void setCliente(ClienteInputId cliente) {
		this.cliente = cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}