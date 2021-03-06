package br.ufc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.dao.IPessoaDAO;
import br.ufc.model.Pessoa;

@Transactional
@Controller
public class PessoaController {
	
	@Autowired
	@Qualifier(value = "pessoaDAO")
	private IPessoaDAO daoPessoa;
	
	@RequestMapping("/cadastrarPessoa")
	public String cadastrarPessoa() {
		return "pessoa/cadastro_pessoa";
	}
	
	@RequestMapping("/cadastroPessoaFormulario")
	public String cadastroPessoaFormulario(Pessoa pessoa) {
		daoPessoa.inserir(pessoa);
		return "pessoa/inserido_ok";
	}
	
	@RequestMapping("/alterarPessoa")
	public String alterarPessoa(Long id, Model model) {
		Pessoa pessoa = daoPessoa.recuperar(id);
		if (pessoa != null) {
			model.addAttribute("pessoa", pessoa);
			return "pessoa/altera_pessoa";
		}
		return "redirect:erro";
	}
	
	@RequestMapping("/alteraPessoaFormulario")
	public String alteraPessoaFormulario(Pessoa pessoa) {
		daoPessoa.alterar(pessoa);
		return "redirect:listarPessoa";
	}
	
	@RequestMapping("/apagarPessoa")
	public String apagarPessoa(Long id) {
		if (daoPessoa.apagar(id))
			return "redirect:listarPessoa";
		else
			return "redirect:erro";
	}
	
	@RequestMapping("/listarPessoa")
	public String listarPessoa(Model model) {
		List<Pessoa> pessoas = daoPessoa.listar();
		model.addAttribute("pessoas", pessoas);
		return "pessoa/lista_pessoa";
	}
	
	@RequestMapping("/visualizarPessoa")
	public String visualizarPessoa(Long id, Model model) {
		Pessoa pessoa = daoPessoa.recuperar(id);
		if (pessoa != null) {
			model.addAttribute("pessoa", pessoa);
			model.addAttribute("filmes", pessoa.filmesQueParticipou());
			return "pessoa/visualiza_pessoa";
		}
		return "redirect:erro";
	}
	
	@RequestMapping("/erro")
	public String erro() {
		return "erro";
	}
}
