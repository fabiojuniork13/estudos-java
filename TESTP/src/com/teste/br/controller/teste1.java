package com.teste.br.controller;

import java.text.DecimalFormat;
import java.util.Date;

public class teste1 {

	public static void main(String[] args) {

		String uuidTransacao = java.util.UUID.randomUUID().toString();
		System.out.println(uuidTransacao);
		
		Date data = new Date();
		
		
		System.out.println(data);
		
		Integer tam = 5461;
		Double comprimento = null;
		
		java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
		comprimento = Double.valueOf(df.format(tam.doubleValue() / 1000).replace(",", "."));
		
		System.out.println(comprimento);
		
		Integer velocidadeMedida = 0;
		
		Long velocidade = 104L;
		
		velocidadeMedida = velocidade.intValue();
		
		long t = java.lang.System.currentTimeMillis();
		
		System.out.println(java.lang.System.currentTimeMillis());
		
		String a = "12345JRT";
		
		System.out.println(a.substring(a.length()-3, a.length()));
		
		
	}

}
