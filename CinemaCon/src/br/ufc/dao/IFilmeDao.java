package br.ufc.dao;

import java.util.List;

import br.ufc.model.Filme;
import br.ufc.model.Pessoa;

public interface IFilmeDao {
	
	public void adicionarFilme(Filme filme);
	public void alterarFilme(Filme filme);
	public Filme recuperarFilme(Long id);
	public boolean removerFilme(Long id);
	public List<Filme> listarTodosFilmes();
	public Filme buscarFilmeNome(String nome);
}
