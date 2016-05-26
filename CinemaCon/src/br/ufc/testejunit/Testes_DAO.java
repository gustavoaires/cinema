package br.ufc.testejunit;

import java.util.Calendar;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.dao.IPessoaDAO;
import br.ufc.model.Pessoa;
import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:WebContent/WEB-INF/spring-context.xml"})
@Transactional
@TransactionConfiguration(defaultRollback=false)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testes_DAO extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	private IPessoaDAO pdao;
	private static long id ;

	@Test
	public void ctesteRecuperar(){
		Pessoa p = pdao.recuperar(id);		
		Assert.assertEquals("Eduardo", p.getNome());
		
	}
	
	@Test
	public void atesteInserir(){
		Pessoa p = new Pessoa();
		p.setNome("Eduardo");
		p.setSobrenome("Lopes");
		p.setLocalNascimento("Senador");
		p.setDescricao("Forte alto bonito e sensual");
		p.setDataNascimento(Calendar.getInstance().getTime());
		pdao.inserir(p);
	}
	
	@Test
	public void btestelistar(){
		List<Pessoa> ps = pdao.listar();
		id = ps.get(ps.size()-1).getId();
		Assert.assertNotNull(ps);
	}
	
	@Test
	public void etesteApagar(){
		pdao.apagar(id);
		Pessoa pessoa = pdao.recuperar(id); 
		Assert.assertNull(pessoa);
	}
	
	@Test
	public void dtesteAlterar(){
		Pessoa p = new Pessoa();
		p.setId(id);
		p.setNome("Gustavo");
		p.setSobrenome("Aires");
		p.setLocalNascimento("Senador");
		p.setDescricao("Alto magrelo feio e bobo");
		p.setDataNascimento(Calendar.getInstance().getTime());
		pdao.alterar(p);
		Pessoa p2 = pdao.recuperar(p.getId());
		Assert.assertEquals(p2, p);
		
	}
	
}
