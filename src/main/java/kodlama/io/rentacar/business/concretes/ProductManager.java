package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.ProductService;
import kodlama.io.rentacar.entities.Brand;
import kodlama.io.rentacar.entities.Product;
import kodlama.io.rentacar.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private final ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product getById(int id) {
        checkIfProductExists(id);
        return repository.findById(id).orElseThrow();
    }
    @Override
    public Product add(Product product) {
        return repository.save(product);
    }

    @Override
    public Product update(int id, Product product) {
        checkIfProductExists(id);
        product.setId(id);
        return repository.save(product);
    }

    @Override
    public void delete(int id) {
        checkIfProductExists(id);
        repository.deleteById(id);
    }

    // Business rules

    private void checkIfProductExists(int id) {
        if (!repository.existsById(id)) throw new RuntimeException("Böyle bir marka mevcut değil.");
    }
}
