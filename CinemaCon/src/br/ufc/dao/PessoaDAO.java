package br.ufc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.model.Pessoa;

@Repository
public class PessoaDAO implements IPessoaDAO {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void inserir(Pessoa pessoa) {
		manager.persist(pessoa);
	}

	@Override
	public Pessoa recuperar(Long id) {
		Pessoa pessoa = manager.find(Pessoa.class, id);
		return pessoa;
	}
	
	@Override
	public void alterar(Pessoa pessoa) {
		manager.merge(pessoa);
	}

	@Override
	public List<Pessoa> listar() {
		String hql = "select p from pessoa as p";
		List<Pessoa> pessoas = manager.createQuery(hql, Pessoa.class).getResultList();
		return pessoas;
	}

	@Override
	public boolean apagar(Long id) {
		try {
			Pessoa pessoa = recuperar(id);
			if (pessoa != null) {
				manager.remove(pessoa);
				return true;
			}
			return false;
		} catch(Exception e) {
			return false;
		}
	}
}
