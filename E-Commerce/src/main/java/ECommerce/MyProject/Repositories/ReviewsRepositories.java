package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Payments;
import ECommerce.MyProject.Models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepositories extends JpaRepository<Reviews, Integer> {
}
