package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Invoices;
import ECommerce.MyProject.Repositories.InvoicesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvoicesServices {


    @Autowired
    InvoicesRepositories invoiceRepositories;
    public List<Invoices> getAllInvoices() {

        return invoiceRepositories.findAll();
    }

    public Invoices getMarketById(Integer id) {

        return invoiceRepositories.findById(id).get();
    }
}
