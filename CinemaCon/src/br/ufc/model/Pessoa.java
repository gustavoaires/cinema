package br.ufc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import br.ufc.stub.Filme;

@Entity(name="pessoa")
public class Pessoa {
	@Id
	@Column(name="id_pessoa")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String sobrenome;
	
	@Column(name="data_nascimento")
	private Date dataNascimento;
	
	@Column(name="local_nascimento")
	private String localNascimento;
	
	private String descricao;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="filme_pessoa",
		joinColumns=@JoinColumn(name="id_pessoa",
							referencedColumnName="id_pessoa"),
		inverseJoinColumns=@JoinColumn(name="id_filme",
						   referencedColumnName="id_filme"))
	private List<Filme> filmes;
	
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLocalNascimento() {
		return localNascimento;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	public List<Filme> getFilmes() {
		return filmes;
	}
}
