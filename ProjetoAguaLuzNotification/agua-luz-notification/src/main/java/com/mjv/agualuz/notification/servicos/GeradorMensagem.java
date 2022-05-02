package com.mjv.agualuz.notification.servicos;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.util.FormatarDataHora;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.util.FormatadorUtil;


public class GeradorMensagem {
	public void gerarMensagem(Contrato contrato) {
		
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		
		sb.append(String.format("Senhor(a) %s cpf de número %s,",cliente.getNome(), cpfFormatado)); // FORMA 2 SIMPLIFICADO
		
		sb.append(String.format(" Informamos que conforme contrato com protocolo de número %d", contrato.getNumeroProtocolo()));
		
		
		System.out.println(sb.toString());
	}
}
