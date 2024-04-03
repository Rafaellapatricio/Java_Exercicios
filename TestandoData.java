package br.com.vainaweb.backendt2;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestandoData {
	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);
		
		// sao 15 dias de emprestimo do livro
		
		//System.out.println("teste "+c.get(Calendar.));
		
		
		/*Date data = new Date();
		System.out.println("Data Agora: "+data);
		
		Calendar c = Calendar.getInstance();
		System.out.println("Data e Hora atual: "+c.getTime());
		
		System.out.println("Data/Hora atual: "+c.getTime());
		
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mês: "+c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_YEAR));
		int valor= c.get(Calendar.DAY_OF_YEAR)+15;
		int dia= c.get(Calendar.DATE);
		
		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Data atual com formatação: "+ formataData.format(data));
		System.out.println(valor);

		
		//System.out.println("teste "+c.get(Calendar.));
		
		Date data = new Date();		
		DateFormat retorno = DateFormat.getDateInstance();
		Calendar comparar = Calendar.getInstance();
		
		String entrada= retorno.format(data);
		System.out.println("Data de empréstimo: "+entrada);
		
		comparar.add(Calendar.DATE, 15);		
		System.out.println("Data de retorno: "+retorno.format(comparar.getTime()));	
		*/
		System.out.print("\nData de publicação: ");
		String setDataPublic= sc.nextLine();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
		Date datap = formatar.parse(setDataPublic);
		System.out.println(datap);
		
	}
	
	static void verificarDataLimite() {	
		
		Date data = new Date();		
		DateFormat retorno = DateFormat.getDateInstance();
		Calendar comparar = Calendar.getInstance();
		
		String entrada= retorno.format(data);
		System.out.println("Data de empréstimo: "+entrada);
		
		comparar.add(Calendar.DATE, 15);		
		System.out.println("Data de retorno: "+retorno.format(comparar.getTime()));	
	}
}

