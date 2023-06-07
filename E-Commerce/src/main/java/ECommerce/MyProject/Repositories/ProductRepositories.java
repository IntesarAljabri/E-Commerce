package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositories extends JpaRepository<Product, Integer> {
}
