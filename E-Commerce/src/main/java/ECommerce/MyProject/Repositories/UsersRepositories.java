package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepositories extends JpaRepository<Users, Integer> {
}
