package com.mjv.openbanking;

import java.time.LocalDate;

//lombok
public class Movimentacao {
	private LocalDate data;
	private String cpfCnpj;
	private String nome;
	private Double valor;
	private TipoMovimentacao tipo;
	private Boolean estornada;


	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Boolean getEstornada() {
		return estornada;
	}

	public void setEstornada(Boolean estornada) {
		this.estornada = estornada;
	}

	/*
	@Override
	public String toString() {
		return "Movimentacao " 
	+ "data=" + data 
	+ ", cpfCnpj=" + cpfCnpj 
	+ ", nome=" + nome 
	+ ", valor=" + valor
	+ ", estornada=" + estornada 
	+ ", tipo=" + tipo;
	}
	*/

}
