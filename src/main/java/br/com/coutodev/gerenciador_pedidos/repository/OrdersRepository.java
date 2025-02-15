package br.com.coutodev.gerenciador_pedidos.repository;

import br.com.coutodev.gerenciador_pedidos.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
