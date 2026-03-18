package com.projetoweb.segundo_projeto.config;



import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoweb.segundo_projeto.entities.Category;
import com.projetoweb.segundo_projeto.entities.Order;
import com.projetoweb.segundo_projeto.entities.User;
import com.projetoweb.segundo_projeto.entities.enums.OrderStatus;
import com.projetoweb.segundo_projeto.repositories.CategoryRepository;
import com.projetoweb.segundo_projeto.repositories.OrderRepository;
import com.projetoweb.segundo_projeto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository useOrderRepository;
	@Autowired
	private CategoryRepository useCategoryRepository;

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		useCategoryRepository.saveAll(List.of(cat1,cat2,cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
	
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAD,u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1); 
		userRepository.saveAll(List.of(u1, u2));
		useOrderRepository.saveAll(List.of(o1,o2,o3));
	}
}
