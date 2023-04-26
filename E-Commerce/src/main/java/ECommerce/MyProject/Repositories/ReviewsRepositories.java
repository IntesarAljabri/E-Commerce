package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Payments;
import ECommerce.MyProject.Models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepositories extends JpaRepository<Reviews, Integer> {
}
