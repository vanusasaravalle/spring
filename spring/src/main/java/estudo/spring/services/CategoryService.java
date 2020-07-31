package estudo.spring.services;

import estudo.spring.entities.Category;
import estudo.spring.entities.User;
import estudo.spring.repositories.CategoryRepository;
import estudo.spring.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public List<Category> findAll(){

        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);

        return obj.get();
    }
}
