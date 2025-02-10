package br.com.devh12.frete;

import br.com.devh12.frete.services.Order;
import br.com.devh12.frete.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FreteApplication implements CommandLineRunner {

	public OrderService service;

	public FreteApplication(OrderService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(FreteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034,150.0,20.0);
		System.out.println("Pedido código "+ order.getCodigo());
		System.out.println("Valor total: R$ " + service.total(order));

		Order order1 = new Order(2282,800.0,10.0);
		System.out.println("Pedido código "+ order1.getCodigo());
		System.out.println("Valor total: R$ " + service.total(order1));

		Order order2 = new Order(1309,95.90,0.0);
		System.out.println("Pedido código "+ order2.getCodigo());
		System.out.println("Valor total: R$ " + service.total(order2));

	}
}
