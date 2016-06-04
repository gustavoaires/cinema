package br.ufc.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.model.Filme;

@Repository
public class FilmeDao implements IFilmeDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionarFilme(Filme filme) {
		manager.persist(filme);
	}

	@Override
	public void alterarFilme(Filme filme) {
		manager.merge(filme);
	}
	
	public Filme recuperarFilme(Long id) {
		return manager.find(Filme.class, id);
	}

	@Override
	public boolean removerFilme(Long id) {
		try {
			Filme ref = this.recuperarFilme(id);
			if(ref!=null){
				manager.remove(ref);
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<Filme> listarTodosFilmes() {
		return manager.createQuery("select f from filme as f",
				Filme.class).getResultList();
	}

	@Override
	public Filme buscarFilmeNome(String nome) {
		return manager.createQuery("select f from filme as f where f.nome like: filme.nome",
				Filme.class).getSingleResult();
	}
	
}
