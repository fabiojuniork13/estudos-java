package br.com.app.exerciciossb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.app.exerciciossb.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
}
