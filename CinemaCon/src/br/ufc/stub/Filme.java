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
	
	@ManyToMany(mappedBy="filmes", fetch=FetchType.LAZY)
	private List<Pessoa> pessoas;
	
	private String genero;
	private Double duracao;
	private Integer classificacao;
	private String distribuidora;
	private String idioma;
	private String nome;
	private String sinopse;
	
	public String getSinopse() {
		return "";
	}
	public void setSinopse(String sinopse) {}
	public List<Pessoa> getPessoas() {
		return new ArrayList<>();
	}
	public void setPessoas(List<Pessoa> pessoas) {}
	public String getGenero() {
		return "";
	}
	public void setGenero(String genero) {}
	public Double getDuracao() {
		return 1D;
	}
	public void setDuracao(Double duracao) {}
	public Integer getClassificacao() {
		return 1;
	}
	public void setClassificacao(Integer classificacao) {}
	public String getDistribuidora() {
		return "";
	}
	public void setDistribuidora(String distribuidora) {}
	public String getIdioma() {
		return "";
	}
	public void setIdioma(String idioma) {}
	public Long getId() {
		return 1L;
	}
	public String getNome() {
		return null;
	}
	public void setNome(String nome) {}
	public void setId(Long id) {}
}
