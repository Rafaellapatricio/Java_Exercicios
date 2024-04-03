package br.com.vainaweb.backendt2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacaoCPF {
	
	public static void main(String[] args) {
		Pattern cpf = Pattern.compile("^[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}$");		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu cpf: ");
		String SetCpf=sc.findInLine(cpf);
		
		
		Matcher verificando= cpf.matcher(SetCpf);
		
		System.out.println("O cpf é"+verificando.find());		
	
	}
}
