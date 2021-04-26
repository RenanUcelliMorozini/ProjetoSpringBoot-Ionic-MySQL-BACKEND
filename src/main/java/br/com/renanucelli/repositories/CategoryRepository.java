package br.com.renanucelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.renanucelli.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
