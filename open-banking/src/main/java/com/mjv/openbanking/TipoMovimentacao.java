package com.mjv.openbanking;

public enum TipoMovimentacao {
	RECEITA ("R"), 
	DESPESA ("D"); 
	
	private String tipoDeMovimentacao;

	private TipoMovimentacao(String tipoDeMovimentacao) {
		this.tipoDeMovimentacao = tipoDeMovimentacao;
	}

	public String getTipoDeMovimentacao() {
		return tipoDeMovimentacao;
	}
	
	
	
	
}
