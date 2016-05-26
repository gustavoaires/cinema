package br.ufc.testejunit;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
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
public class TesteJunit extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	private IPessoaDAO pdao;
	

	@Test
	public void testeRecuperar(){
		Pessoa p = pdao.recuperar(1L);		
		Assert.assertEquals("Eduardo", p.getNome());
		
	}
	
	@Test
	public void testeInserir(){
		Pessoa p = new Pessoa();
		p.setNome("Eduardo");
		p.setSobrenome("Lopes");
		p.setLocalNascimento("Senador");
		p.setDescricao("Forte alto bonito e sensual");
		p.setDataNascimento(Calendar.getInstance().getTime());
		pdao.inserir(p);
		
	}
	
	@Test
	public void testelistar(){
		List<Pessoa> ps = pdao.listar();
		Assert.assertNotNull(ps);
	}
	
	@Test
	public void testeApagar(){
		pdao.apagar(3L);
		Pessoa pessoa = pdao.recuperar(3L);
		Assert.assertNull(pessoa);
	}
	
}
