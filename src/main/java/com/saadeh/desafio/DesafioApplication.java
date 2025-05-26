package com.saadeh.desafio;

import com.saadeh.desafio.entities.Order;
import com.saadeh.desafio.entities.exception.OrderException;
import com.saadeh.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)");
		System.out.print("Ordem:");
		int numeroOrder = sc.nextInt();
		sc.nextLine();
		System.out.print("Valor:");
		Double basicValue = sc.nextDouble();
		System.out.print("Desconto:");
		Double discountValue = sc.nextDouble();

		try {
			Order order = new Order(numeroOrder,basicValue,discountValue);

			System.out.printf("Pedido código: %s%n", order.getCode());
			System.out.printf("Valor total: %.2f%n",orderService.total(order));
		}catch (OrderException e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
