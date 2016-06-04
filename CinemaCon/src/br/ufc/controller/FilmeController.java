package br.ufc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.dao.IFilmeDao;
import br.ufc.dao.IPessoaDAO;
import br.ufc.model.Filme;

@Transactional
@Controller
public class FilmeController {
	
	@Autowired
	@Qualifier(value="filmeDAO")
	private IFilmeDao filmeDao;
	
	@Autowired
	@Qualifier(value="pessoaDAO")
	private IPessoaDAO pessoaDAO;
	
	@RequestMapping("/cadastrarFilmeFormulario")
	public String addFilme(Model model) {
		model.addAttribute("pessoas", pessoaDAO.listar());
		return "cadastro";
	}
	
	@RequestMapping("/cadastrarFilme")
	public String cadastrarFilme(@ModelAttribute("filme")Filme filme, BindingResult result) {
		filmeDao.adicionarFilme(filme);
		return "index";
	}
	
	@RequestMapping("/listarFilme")
	public String listarFilme(Filme filme, Model model) {
		List<Filme> filmes = filmeDao.listarTodosFilmes();
		model.addAttribute("listaFilme", filmes);
		return "listaFilme";
	}
	
	@RequestMapping("/apagarFilme")
	public String apagarFilme(Long id) {
		if (!filmeDao.removerFilme(id)) {
			return "erro";
		}
		return "FilmeRemovido";
	}
	
	@RequestMapping("/alterarFilmeFormulario")
	public String alterarFilmeFormulario(Long id, Model model) {
		Filme filme = filmeDao.recuperarFilme(id);
		if (filme != null) {
			model.addAttribute("filme", filme);
			return "alterar";
		}
		return "erro";
	}
	
	@RequestMapping("/alterarFilme")
	public String alterarFilmeFormulario(Filme filme) {
		filmeDao.alterarFilme(filme);
		return "redirect:/";
	}
}
