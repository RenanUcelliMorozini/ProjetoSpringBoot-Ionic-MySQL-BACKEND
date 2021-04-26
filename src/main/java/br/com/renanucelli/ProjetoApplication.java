package br.com.renanucelli;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.renanucelli.domain.Category;
import br.com.renanucelli.domain.Product;
import br.com.renanucelli.repositories.CategoryRepository;
import br.com.renanucelli.repositories.ProductRepository;

@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 80.00);
		
		cat1.getProduct().addAll(Arrays.asList(p1, p2, p3));		
		cat2.getProduct().addAll(Arrays.asList(p2));
		
		p1.getCategory().addAll(Arrays.asList(cat1));
		p2.getCategory().addAll(Arrays.asList(cat1, cat2));
		p3.getCategory().addAll(Arrays.asList(cat1));
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
	}
}
