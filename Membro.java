package br.com.vainaweb.backendt2;

public class Membro {
	
	//private String nome;
	private String cpf;
	//private String rg;
	//private String email;
	//private String telefone;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Membro(String cpf) {
		this.cpf=cpf;
	}

}
