package merkanto.sdjpaorderservice.repositories;

import merkanto.sdjpaorderservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
