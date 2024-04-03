package br.com.vainaweb.backendt2;

import java.util.Random;

public class valorAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerarNumero = new Random();
		
		// gerar o numero da conta aleatorialmente
		
		for (int i = 1; i <= 1; i++) {
			if(gerarNumero.nextInt()>0) {
				System.out.println("CÓDIGO GERADO: "+gerarNumero.nextInt());
			}
			
			else {
				int result= gerarNumero.nextInt();
				String regex = "" + result;
				regex = regex.replaceAll("-", "");
				int inteiro= Integer.parseInt(regex);
				//int inteiro= Interger.parseInt
				System.out.println("CÓDIGO GERADO DO NEGATIVO: "+inteiro);	
			}
		}
	}

}
