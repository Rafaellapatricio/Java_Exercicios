package br.com.vainaweb.backendt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestandoRegex {
	public static void main(String[] args) {
	
	
		Pattern cpf = Pattern.compile("^[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}$");		
		Matcher verificando= cpf.matcher("093.495.774-59");
		
		System.out.println(verificando.find());		
	
		
		
		/* input string
        String str = "GFG";
        System.out.println(str);
 
        // NULL Regular expression
        String regex = "\\";
 
        // Passing null expression in
        // replaceAll method
        str = str.replaceAll(regex, " ");
 
        System.out.println(str);*/
	}

}
