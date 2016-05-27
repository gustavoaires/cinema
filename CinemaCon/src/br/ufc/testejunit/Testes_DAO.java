package br.ufc.testejunit;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.dao.IPessoaDAO;
import br.ufc.model.Pessoa;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;


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
	public void ctesteRecuperarIdValido(){
		Pessoa p = pdao.recuperar(id);		
		Assert.assertEquals("Eduardo", p.getNome());
		
	}
	
	@Test
	public void ctesteRecuperarIdInvalido(){
		Pessoa p = pdao.recuperar(0L);
		Assert.assertNull(p);
	}
	
	@Test
	public void actesteInserir(){
		Pessoa p = new Pessoa();
		p.setNome("Eduardo");
		p.setSobrenome("Lopes");
		p.setLocalNascimento("Senador");
		p.setDescricao("Forte alto bonito e sensual");
		p.setDataNascimento(new Date(1995, 10, -1));
		pdao.inserir(p);
	}
	
	@Test
	public void abtesteInserirPessoaDataMesInvalido(){
		Pessoa p = new Pessoa();
		p.setNome("Eduardo");
		p.setSobrenome("Lopes");
		p.setLocalNascimento("Senador");
		p.setDescricao("Forte alto bonito e sensual");
		p.setDataNascimento(new Date(1995, -1, 10));
		pdao.inserir(p);
	}
	
	@Test
	public void aatesteInserirPessoaDataDiaInvalido(){
		Pessoa p = new Pessoa();
		p.setNome("Eduardo");
		p.setSobrenome("Lopes");
		p.setLocalNascimento("Senador");
		p.setDescricao("Forte alto bonito e sensual");
		p.setDataNascimento(new Date(1995, 10, -1));
		pdao.inserir(p);
	}
	
	@Test
	public void btesteListar(){
		List<Pessoa> ps = pdao.listar();
		id = ps.get(ps.size()-1).getId();
		Assert.assertEquals(true, ps.size()>0);
	}

	@Test
	public void etesteApagarPessoaIdValido(){
		pdao.apagar(id);
		Pessoa pessoa = pdao.recuperar(id); 
		Assert.assertNull(pessoa);
	}

	@Test
	public void etesteApagarPessoaIdInvalido(){
		try{
			pdao.apagar(-1L);
		}catch(Exception e){
			Assert.assertEquals(true, true);
		}
	}
	

	@Test
	public void dtesteAlterarPessoaIdvalido(){
		Pessoa p = new Pessoa();
		p.setId(id);
		p.setNome("Gustavo");
		p.setSobrenome("Aires");
		p.setLocalNascimento("Tocantins");
		p.setDescricao("Alto magrelo feio e bobo");
		p.setDataNascimento(new Date(1995, 05, 15));
		pdao.alterar(p);
		Pessoa p2 = pdao.recuperar(p.getId());
		Assert.assertEquals(p2, p);
	}
	
	@Test
	public void dtesteAlterarPessoaIdInvalido(){
		Pessoa p = new Pessoa();
		p.setId(-1L);
		p.setNome("Gustavo");
		p.setSobrenome("Aires");
		p.setLocalNascimento("Tocantins");
		p.setDescricao("Alto magrelo feio e bobo");
		p.setDataNascimento(new Date(1995, 05, 15));
		pdao.alterar(p);
		Pessoa p2 = pdao.recuperar(p.getId());
		Assert.assertEquals(p2, p);
	}
	
	@Test
	public void dtesteAlterarPessoaDataMesInvalido(){
		Pessoa p2 = pdao.recuperar(id);
		Pessoa p = new Pessoa();
		p.setId(id);
		p.setNome("Gustavo");
		p.setSobrenome("Aires");
		p.setLocalNascimento("Tocantins");
		p.setDescricao("Alto magrelo feio e bobo");
		p.setDataNascimento(new Date(1995, -1, 15));
		pdao.alterar(p);
		Assert.assertEquals(p2, p);
	}
	
	@Test
	public void dtesteAlterarPessoaDataDiaInvalido(){
		Pessoa p = new Pessoa();
		p.setId(id);
		p.setNome("Gustavo");
		p.setSobrenome("Aires");
		p.setLocalNascimento("Tocantins");
		p.setDescricao("Alto magrelo feio e bobo");
		p.setDataNascimento(new Date(1995, 05, -1));
		pdao.alterar(p);
		Pessoa p2 = pdao.recuperar(p.getId());
		Assert.assertEquals(p2, p);
	}
	

}
