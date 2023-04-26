package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Shipping_AddressesRepositories<Shippings_Addresses> extends JpaRepository<Shippings_Addresses, Integer> {
}
