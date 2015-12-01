package br.com.testes.modelo;

import java.io.Serializable;

/**
 * Entity Pessoa.
 * 
 * @author Allessandro
 *
 */
public class Pessoa implements Serializable{

	/**
	 * Serial Version
	 */
	private static final long serialVersionUID = -7013328774461204969L;

	private Long id;
	
	private String nome;
	
	private Boolean ativo;
	
	public Pessoa(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
