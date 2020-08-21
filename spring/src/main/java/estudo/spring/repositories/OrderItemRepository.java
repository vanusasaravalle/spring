package estudo.spring.repositories;

import estudo.spring.entities.OrdemItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrdemItem,Long> {
}
