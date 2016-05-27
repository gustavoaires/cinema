package br.ufc.dao;

import java.util.List;

import br.ufc.model.Pessoa;

public interface IPessoaDAO {

	public void inserir(Pessoa pessoa);
	public Pessoa recuperar(Long id);
	public void alterar(Pessoa pessoa);
	public List<Pessoa> listar();
	public boolean apagar(Long id);
}
