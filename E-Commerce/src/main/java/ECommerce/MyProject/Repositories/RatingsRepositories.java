package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Ratings;
import ECommerce.MyProject.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingsRepositories extends JpaRepository<Ratings, Integer> {
}
