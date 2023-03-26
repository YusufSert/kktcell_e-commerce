package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.entities.Product;

import java.util.List;

public interface ProductService {
    // CRUD operations
    List<Product> getAll();
    Product getById(int id);
    Product add(Product producti);
    Product update(int id, Product product);
    void delete(int id);
}
