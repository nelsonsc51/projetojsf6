package br.com.projetojsf6;

import javax.faces.bean.ManagedBean;

//com essa antação de torna o controlador de alguma página jsf,
//que será chamado pelo seu name
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private String nome;
	private String sobrenome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	
}
