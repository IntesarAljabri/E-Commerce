package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepositories extends JpaRepository<Users, Integer> {
}
