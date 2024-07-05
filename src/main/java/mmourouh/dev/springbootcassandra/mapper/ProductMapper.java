package mmourouh.dev.springbootcassandra.mapper;

import mmourouh.dev.springbootcassandra.dto.ProductDTO;
import mmourouh.dev.springbootcassandra.entity.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductMapper implements Function<ProductDTO, Product> {
    @Override
    public Product apply(ProductDTO productDTO) {
        return new Product(productDTO.id(), productDTO.name(), productDTO.description(), productDTO.price());
    }
}
