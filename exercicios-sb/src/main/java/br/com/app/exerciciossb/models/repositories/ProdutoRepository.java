package br.com.app.exerciciossb.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.app.exerciciossb.models.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	// findByNomeContaining
	// findByNomeIsContaining
	// findByNomeContains
	
	// findByNomeStartsWith
	// findByNomeEndsWith
	
	// findByNomeNotContaining
	
	// Lembrar aqui que não pode fazer select * from, porque o * não é reconhecido
	// Sendo assim, a tabela deve ser renomeada e passada como parametro.
	// Também colocar a tabela na converção de classe: Não PRODUTO, não produto
	// E sim Produto, da forma como é declarado na classe
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
