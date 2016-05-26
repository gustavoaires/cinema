package br.ufc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.dao.IPessoaDAO;
import br.ufc.model.Pessoa;

@Transactional
@Controller
public class PessoaController {

	/*
	 * TODO
	 * Fazer os requests e testar cada
	 */
	
	@Autowired
	@Qualifier(value="pessoaDAO")
	private IPessoaDAO daoPessoa;
	
	@RequestMapping("/cadastrarPessoa")
	public String cadastrarPessoa() {
		return "pessoa/cadastro_pessoa";
	}
	
	@RequestMapping("/cadastroPessoaFormulario")
	public String cadastroPessoaFormulario(Pessoa pessoa, BindingResult result) {
		if (pessoa != null)
			daoPessoa.inserir(pessoa);
		return "pessoa/inserido_ok";
	}
	
	@RequestMapping("/alterarPessoa")
	public String alterarPessoa(Long id, Model model) {
		Pessoa pessoa = daoPessoa.recuperar(id);
		model.addAttribute("pessoa", pessoa);
		return "pessoa/altera_pessoa";
	}
	
	@RequestMapping("/listarPessoa")
	public String listarPessoa(Model model) {
		List<Pessoa> pessoas = daoPessoa.listar();
		model.addAttribute("pessoas", pessoas);
		return "pessoa/lista_pessoa";
	}
	
	@RequestMapping("/visualizarPessoa")
	public String visualizarPessoa() {
		return "pessoa/visualiza_pessoa";
	}
}
