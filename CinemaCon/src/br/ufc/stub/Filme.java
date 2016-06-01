package br.ufc.stub;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import br.ufc.model.Pessoa;

@Entity(name="filme")
public class Filme {

	@Id
	@Column(name="id_filme")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToMany(mappedBy="filmesPessoaDiretor", fetch=FetchType.LAZY)
	private List<Pessoa> diretores;
	
	@ManyToMany(mappedBy="filmesPessoaAtor", fetch=FetchType.LAZY)
	private List<Pessoa> atores;
	
	public String getSinopse() { return "Duas pessoas que vivem numa ilha"; }
	public void setSinopse(String sinopse) {}
	
	public List<Pessoa> getPessoas() { return new ArrayList<>(); }
	public void setPessoas(List<Pessoa> pessoas) {}
	
	public String getGenero() { return "Sessão da tarde"; }
	public void setGenero(String genero) {}
	
	public Double getDuracao() { return 1D; }
	public void setDuracao(Double duracao) {}
	
	public Integer getClassificacao() { return 1; }
	public void setClassificacao(Integer classificacao) {}
	
	public String getDistribuidora() { return "Paramount"; }
	public void setDistribuidora(String distribuidora) {}
	
	public String getIdioma() { return "Portugues"; }
	public void setIdioma(String idioma) {}
	
	public Long getId() { return 1L; }
	public void setId(Long id) {}
	
	public String getNome() { return "Lagoa azul"; }
	public void setNome(String nome) {}
	
	public List<Pessoa> getDiretores() { return new ArrayList<>(); }
	public void setDiretores(List<Pessoa> diretores) {}
	
	public List<Pessoa> getAtores() { return new ArrayList<>(); }
	public void setAtores(List<Pessoa> atores) {}
}
