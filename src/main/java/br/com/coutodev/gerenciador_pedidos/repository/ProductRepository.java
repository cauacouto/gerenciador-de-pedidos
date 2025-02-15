package br.com.coutodev.gerenciador_pedidos.repository;

import br.com.coutodev.gerenciador_pedidos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}



