package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepositories extends JpaRepository<Orders, Integer> {
}
