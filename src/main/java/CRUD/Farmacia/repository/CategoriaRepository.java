package CRUD.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import CRUD.Farmacia.model.Categoria;

 public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
	 public List<Categoria> findAllByFabricanteContainingIgnoreCase (String fabricante);
	 

}
