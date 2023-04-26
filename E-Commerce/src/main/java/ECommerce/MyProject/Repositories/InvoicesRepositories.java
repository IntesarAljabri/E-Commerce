package ECommerce.MyProject.Repositories;

import ECommerce.MyProject.Models.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoicesRepositories extends JpaRepository<Invoices, Integer> {
}
