package br.ufc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity(name="filme")
public class Filme {
	
	@Id
	@Column(name="id_filme")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String genero;
    
	private int duracao;
    
	private int classificacao;
    
	private String sinopse;
    
	private String distribuidora;
    
	private String idioma;
	
	@ManyToMany(mappedBy="filmesPessoaDiretor", fetch=FetchType.EAGER)
	private List<Pessoa> listaDiretores;
	
	@ManyToMany(mappedBy="filmesPessoaAtor", fetch=FetchType.EAGER)
	private List<Pessoa> listaAtores; 
    
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public List<Pessoa> getlistaDiretores() {
		return listaDiretores;
	}

	public void setlistaDiretores(List<Pessoa> listaDiretores) {
		this.listaDiretores = listaDiretores;
	}

	public List<Pessoa> getlistaAtores() {
		return listaAtores;
	}

	public void setAtores(List<Pessoa> listaAtores) {
		this.listaAtores = listaAtores;
	}

}