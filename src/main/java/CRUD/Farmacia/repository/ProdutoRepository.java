package CRUD.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import CRUD.Farmacia.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
public List<Produto> findAllByDescricaoIgnireCase(String descricao);
}
