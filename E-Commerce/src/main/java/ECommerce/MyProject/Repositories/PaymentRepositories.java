package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Orders;
import ECommerce.MyProject.Models.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepositories extends JpaRepository<Payments, Integer> {
}
