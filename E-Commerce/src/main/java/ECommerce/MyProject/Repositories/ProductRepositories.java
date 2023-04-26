package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositories extends JpaRepository<Product, Integer> {
}
