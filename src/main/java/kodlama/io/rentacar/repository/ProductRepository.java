package kodlama.io.rentacar.repository;

import kodlama.io.rentacar.entities.Product;
import org.hibernate.boot.model.source.spi.Sortable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//"@Repository" eklemeye gerek yok çunkü extend edilen classların methodkarı var ile birlikte bir base class oluşturulacak
public interface ProductRepository extends JpaRepository<Product, Integer> {
    //ProductDataAccess
    // Custom queries
}
