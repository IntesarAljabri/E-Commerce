package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicesRepositories extends JpaRepository<Invoices, Integer> {
}
