package br.com.app.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.exerciciossb.models.entities.Produto;
import br.com.app.exerciciossb.models.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

//	@PostMapping
	public @ResponseBody Produto novoProduto(String nome) {
		Produto produto = new Produto(nome);
		produtoRepository.save(produto);
		return produto;
	}
	
//	@PostMapping
//	public @ResponseBody Produto novoProdutoComPreco(@RequestParam String nome, 
//													 @RequestParam double preco, 
//													 @RequestParam double desconto) {
//		Produto produto = new Produto(nome, preco, desconto * 100);
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@PostMapping
	public @ResponseBody Produto novoProdutoComPreco(@Valid Produto produto) {
		// O @Valid serve para fazer a validação da informação entrate no servidor vindo do client
		// Tirar o @Valid resulta no erro 500
		produtoRepository.save(produto);
		return produto;
	}
	
}
