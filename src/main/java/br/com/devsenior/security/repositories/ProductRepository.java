package br.com.devsenior.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsenior.security.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
