package br.com.app.exerciciossb.models.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.app.exerciciossb.models.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContaining(String parteNome);
}
