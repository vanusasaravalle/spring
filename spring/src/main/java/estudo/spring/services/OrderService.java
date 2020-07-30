package estudo.spring.services;

import estudo.spring.entities.Order;
import estudo.spring.entities.User;
import estudo.spring.repositories.OrderRepository;
import estudo.spring.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public List<Order> findAll(){

        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);

        return obj.get();
    }
}
