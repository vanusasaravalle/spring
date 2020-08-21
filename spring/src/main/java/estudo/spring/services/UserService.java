package estudo.spring.services;

import estudo.spring.entities.User;
import estudo.spring.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public List<User> findAll(){

        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);

        return obj.get();
    }

     public User insertUser(User obj){
        return userRepository.save(obj);
     }

     public void delete(Long id){
        userRepository.deleteById(id);
     }
}
