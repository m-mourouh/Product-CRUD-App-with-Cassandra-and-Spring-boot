package mmourouh.dev.springbootcassandra.repository;

import mmourouh.dev.springbootcassandra.entity.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
}
