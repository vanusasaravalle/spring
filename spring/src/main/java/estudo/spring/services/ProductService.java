package estudo.spring.services;

import estudo.spring.entities.Product;
import estudo.spring.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> findAll(){

        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);

        return obj.get();
    }
}
