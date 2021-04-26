package br.com.renanucelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.renanucelli.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
