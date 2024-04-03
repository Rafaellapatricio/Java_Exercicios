package br.com.vainaweb.backendt2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class validandoCPF {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = ler.next();

        System.out.printf("\nResultado: ");
            // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (ValidaCPF.isCPF(CPF) == true) {
           System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
        }else {
        	System.out.printf("Erro, CPF invalido !!!\n");
        }
		
	}
	
	public class ValidaCPF {
		
		 public static boolean isCPF(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
		    CPF.equals("22222222222") || CPF.equals("33333333333") ||
		    CPF.equals("44444444444") || CPF.equals("55555555555") ||
		    CPF.equals("66666666666") || CPF.equals("77777777777") ||
		    CPF.equals("88888888888") || CPF.equals("99999999999") ||
		   (CPF.length() != 11))
		   return(false);

		char dig10, dig11;
		int sm, i, r, num, peso;
		
		try {
		// Calculo do 1o. Digito Verificador
		  sm = 0;
		  peso = 10;
		  for (i=0; i<9; i++) {              
		   
		    num = (int)(CPF.charAt(i) - 48); 
		    sm = sm + (num * peso);
		    peso = peso - 1;
		  }

		  r = 11 - (sm % 11);
		  if ((r == 10) || (r == 11))
		     dig10 = '0';
		  else dig10 = (char)(r + 48); 

		// Calculo do 2o. Digito Verificador
		  sm = 0;
		  peso = 11;
		  for(i=0; i<10; i++) {
		    num = (int)(CPF.charAt(i) - 48);
		    sm = sm + (num * peso);
		    peso = peso - 1;
		  }

		  r = 11 - (sm % 11);
		  if ((r == 10) || (r == 11))
		     dig11 = '0';
		  else dig11 = (char)(r + 48);

		// Verifica se os digitos calculados conferem com os digitos informados.
		  if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
		     return(true);
		  else return(false);
		} catch (InputMismatchException erro) {
		    return(false);
		}
		  }

	public static String imprimeCPF(String CPF) {
		return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
		  CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
		  }
		}

}
/*

*/