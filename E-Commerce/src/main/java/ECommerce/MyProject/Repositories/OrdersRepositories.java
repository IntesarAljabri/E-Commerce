package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepositories extends JpaRepository<Orders, Integer> {
}
