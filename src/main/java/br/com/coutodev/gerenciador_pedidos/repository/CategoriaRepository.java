package br.com.coutodev.gerenciador_pedidos.repository;

import br.com.coutodev.gerenciador_pedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
