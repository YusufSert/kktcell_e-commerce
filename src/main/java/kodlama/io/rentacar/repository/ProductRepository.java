package kodlama.io.rentacar.repository;

import kodlama.io.rentacar.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Custom queries
}
