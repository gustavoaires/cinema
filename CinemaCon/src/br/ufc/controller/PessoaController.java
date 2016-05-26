package br.ufc.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.dao.IPessoaDAO;
import br.ufc.model.Pessoa;

@Transactional
@Controller
public class PessoaController {

	@Autowired
	@Qualifier(value="pessoaDAO")
	private IPessoaDAO daoPessoa;
	
	@RequestMapping("/cadastrarPessoa")
	public String cadastrarPessoa() {
		return "pessoa/cadastro_pessoa";
	}
	
	@RequestMapping("/cadastroPessoaFormulario")
	public String cadastroPessoaFormulario(Pessoa pessoa) {
		daoPessoa.inserir(pessoa);
		return "pessoa/cadastro_pessoa";
	}
}
