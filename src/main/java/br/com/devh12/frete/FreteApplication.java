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
		Order order = new Order(12,150,20);
		service.total(order);

	}
}
