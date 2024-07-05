package mmourouh.dev.springbootcassandra.mapper;

import mmourouh.dev.springbootcassandra.dto.ProductDTO;
import mmourouh.dev.springbootcassandra.entity.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductDTOMapper implements Function<Product, ProductDTO> {
    @Override
    public ProductDTO apply(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }
}
