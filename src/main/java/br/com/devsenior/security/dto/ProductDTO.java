package br.com.devsenior.security.dto;

import br.com.devsenior.security.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
    
}
