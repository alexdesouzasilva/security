package br.com.devsenior.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsenior.security.dto.ProductDTO;
import br.com.devsenior.security.entity.Product;
import br.com.devsenior.security.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Recurso não encontrado!"));
        return new ProductDTO(product);
    }

    @Transactional
    public ProductDTO save(ProductDTO dto) {
        Product entity = new Product();
        toEntity(dto, entity);
        entity = repository.save(entity);
        return new ProductDTO(entity);
    }

    private void toEntity(ProductDTO dto, Product entity) {
        entity.setId(dto.getId());
        entity.setName(dto.getName());
    }
}
