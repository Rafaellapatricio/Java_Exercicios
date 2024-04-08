package br.com.vainaweb.backendt1.desafiofinal;

import java.util.Scanner;

public class Lib {
	
	public static void main(String[] args) {
		System.out.println("\nSEJA BEM-VINDO A NOSSA BIBLIOTECA DE FUNÇÕES ARITMÉTICAS.");
		Scanner sc= new Scanner(System.in);
		exibirMenu();
		int opcao = sc.nextInt();
		
		//try{
			switch(opcao) {
				case 1:
					System.out.println("SOMAR");
					//somar(OperacoesAritmeticas);				
					break;
				case 2:
					System.out.println("SUBTRAIR");
					//subtrair(opcao, sc, opcao);
					break;
				case 3:
					System.out.println("MULTIPLICAÇÃO");
					//multiplicar(opcao, sc, opcao);
					break;
				case 4:
					System.out.println("DIVISÃO");
					
					break;
				case 5:
					System.out.println("ÁREA");
					
					break;
				case 6:
					System.out.println("PERÍMETRO");
					
					break;
				case 7:
					System.out.println("VOLUME");
					
					break;
				case 8:
					System.out.println("JUROS SIMPLES");
					
					break;
				case 9:
					System.out.println("JUROS COMPOSTO");
					
					break;
				case 10:
					System.out.println("SAIR");
					
					break;
				default:
					System.out.println("Opção inválida");
					break;
			
			}
		
	}

	static void exibirMenu() {
		
		System.out.println("\n");
		System.out.println("  MENU PRINCIPAL");
		System.out.println("---------------------");
		System.out.println("\nQUAL OPERAÇÃO DESEJA REALIZAR?");
		System.out.println("1. Cálculo de Soma.");
		System.out.println("2. Cálculo de Subtração.");
		System.out.println("3. Cálculo de Multiplicação.");
		System.out.println("4. Cálculo de Divisão.");
		System.out.println("5. Cálculo de Àrea.");
		System.out.println("6. Cálculo de Perímetro.");
		System.out.println("7. Cálculo de Volume.");
		System.out.println("8. Cálculo de Juros Simples.");
		System.out.println("9. Cálculo de Juros Composto.");
		System.out.println("10. Sair\nDigite aqui->  ");	
	}
	
	static void somar(OperacoesAritmeticas somar) {
		//somar.somar(0, null, 0);
	}
	
	static void subtrair(OperacoesAritmeticas subtrair) {
		
	}
	
	static void multiplicar(OperacoesAritmeticas multiplicar) {
		
	}
	static void dividir(OperacoesAritmeticas dividir) {
		
	}
	
	

}

//classe de operações aritmeticas

package br.com.vainaweb.backendt1.desafiofinal;

import java.util.Scanner;

public class OperacoesAritmeticas {
	
	public OperacoesAritmeticas(){
		
	}

	public void somar(float valor, int qtd) {
		
		//System.out.println(" Quanto valores deseja calcular? ");
		//qtd= sc.nextInt();
		/*double result=0;
		
		for(int i=0; i<qtd; i++) {
			//System.out.println("Digite o " +i+ " número: ");
			//valor= sc.nextFloat();
			result+=valor;
		//}
		//System.out.println(result); 
		}
		System.out.println("O total da sua soma é: "+result);
		
		System.out.println(" Quanto valores deseja calcular? ");
		double[] qtdo= new double[10]; 
		double result=0;
		
		for(int i=0; i<qtdo.length; i++) {
			System.out.println("Digite o " +i+ " número: ");
			valor= sc.nextFloat();
			result=qtdo[i]-result;*/
			
	}
	
	public void subtrair(double[] qtdo) {
		System.out.println(" Quanto valores deseja calcular? ");
		qtdo= new double[10]; 
		double result=0;
		
		for(int i=0; i<qtdo.length; i++) {
			System.out.println("Digite o " +i+ " número: ");
			//valor= sc.nextFloat();
			result=qtdo[i]-result;
			
		//}	System.out.println(result); 
		}
		System.out.println("O total da subtração é: "+result);
	}
	
	void multiplicar(float valor, Scanner sc, int qtd) {
		System.out.println(" Quanto valores deseja calcular? ");
		qtd= sc.nextInt();
		double result=1;
		
		for(int i=0; i<qtd; i++) {
			System.out.println("Digite o " +i+ " número: ");
			valor= sc.nextFloat();
			result=result*valor;
		//}
		System.out.println(result); 
		}
		System.out.println("O total da sua multiplicação é: "+result);
	}
	void dividir (float valor, Scanner sc, int qtd) {
		System.out.println(" Quanto valores deseja calcular? ");
		qtd= sc.nextInt();
		double result=0;
		
		for(int i=0; i<qtd; i++) {
			System.out.println("Digite o " +i+ " número: ");
			valor= sc.nextFloat();
			result+=valor;
		//}
		System.out.println(result); 
		}
		System.out.println("O total da sua divisão é: "+result);
	}
}
