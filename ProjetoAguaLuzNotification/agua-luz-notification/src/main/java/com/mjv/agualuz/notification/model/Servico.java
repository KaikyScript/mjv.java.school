package com.mjv.agualuz.notification.model;

public enum Servico {

	AGUA ("ÁGUA",137.21),
	LUZ("Energia",132.15);
	
	private String descricao;
	private Double valor;
	
	private Servico(String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
		
	}
	public String getDescicao() {
		return descricao;
	}
	public Double getValor() {
		return valor;
	}
	public String getSigla() {
		return name().substring(0,1);
	}
	
}
