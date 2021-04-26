package br.com.renanucelli;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.renanucelli.domain.Category;
import br.com.renanucelli.repositories.CategoryRepository;

@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		
	}
	
	@Autowired
	private CategoryRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		repo.saveAll(Arrays.asList(cat1, cat2));
		
	}
}
