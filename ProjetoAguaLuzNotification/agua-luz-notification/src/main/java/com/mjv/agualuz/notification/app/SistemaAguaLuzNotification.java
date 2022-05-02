package com.mjv.agualuz.notification.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.model.Pais;
import com.mjv.agualuz.notification.model.Servico;
import com.mjv.agualuz.notification.servicos.GeradorMensagem;

public class SistemaAguaLuzNotification {
	public static void main(String[] args) {
		// CONTRATAÇÃO DO SERVIÇO
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of (2022, 2, 21, 16, 0));
		contrato.setNumeroProtocolo(2022025687L);
		
		contrato.setServico(Servico.AGUA);
		
		// CADASTRO DO CLIENTE
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		
		cliente.setCpf("23476598727");
		cliente.setNome("Gleyson Sampaio");
		cliente.setPais(Pais.BRASIL);
		
		// ENDEREÇO
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310657");
		endereco.setCidade("São Paulo");
		endereco.setComplemento("Bloco C");
		endereco.setEstado("SP");
		endereco.setLongradouro("Rua das Marias");
		endereco.setNumero("243");
		
		GeradorMensagem gm = new GeradorMensagem();
		gm.gerarMensagem(contrato);
		
	}
} 
