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
	@JoinTable(name="filme_pessoa_diretor",
		joinColumns=@JoinColumn(name="id_pessoa",
					referencedColumnName="id_pessoa"),
		inverseJoinColumns=@JoinColumn(name="id_filme",
				   	referencedColumnName="id_filme"))
	private List<Filme> filmesPessoaDiretor;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="filme_pessoa_ator",
		joinColumns=@JoinColumn(name="id_pessoa",
					referencedColumnName="id_pessoa"),
		inverseJoinColumns=@JoinColumn(name="id_filme",
					referencedColumnName="id_filme"))
	private List<Filme> filmesPessoaAtor;
	
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
	public void setFilmesPessoaAtor(List<Filme> filmes) {
		this.filmesPessoaAtor = filmes;
	}
	public List<Filme> getFilmesPessoaAtor() {
		return filmesPessoaAtor;
	}
	public List<Filme> getFilmesPessoaDiretor() {
		return filmesPessoaDiretor;
	}
	public void setFilmesPessoaDiretor(List<Filme> filmesPessoaDiretor) {
		this.filmesPessoaDiretor = filmesPessoaDiretor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}
	
	public List<Filme> filmesQueParticipou() {
		List<Filme> filmes = filmesPessoaAtor;
		for (Filme f : filmesPessoaDiretor)
			if (!filmes.contains(f))
				filmes.add(f);
		return filmes;
	}
	
}
