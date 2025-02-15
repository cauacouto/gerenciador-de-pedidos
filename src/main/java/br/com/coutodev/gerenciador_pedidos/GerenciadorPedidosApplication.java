package br.com.coutodev.gerenciador_pedidos;

import br.com.coutodev.gerenciador_pedidos.model.Categoria;
import br.com.coutodev.gerenciador_pedidos.model.Orders;
import br.com.coutodev.gerenciador_pedidos.model.Product;
import br.com.coutodev.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.coutodev.gerenciador_pedidos.repository.OrdersRepository;
import br.com.coutodev.gerenciador_pedidos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private OrdersRepository OrdersRepository;







	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);




	}

	@Override
	public void run(String... args) throws Exception {

    Product product = new Product("notboock",1000.00);
		Categoria categoria=new Categoria(1l,"eletronico");
		Orders orders = new Orders(1l, LocalDate.now());
	productRepository.save(product);
	categoriaRepository.save(categoria);
	OrdersRepository.save(orders);


	}
}
