package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Orders;
import ECommerce.MyProject.Models.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositories extends JpaRepository<Payments, Integer> {
}
