package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.ShippingCarts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingCartsRepositories extends JpaRepository<ShippingCarts, Integer> {
}
