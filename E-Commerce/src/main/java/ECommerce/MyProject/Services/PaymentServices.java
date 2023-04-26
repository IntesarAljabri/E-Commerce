package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Payments;
import ECommerce.MyProject.Repositories.PaymentRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentServices {

    @Autowired
    PaymentRepositories paymentRepositories;
    public List<Payments> getAllPayments() {
        return paymentRepositories.findAll();
    }
    public Payments getPaymenttById(Integer id) {

        return paymentRepositories.findById(id).get();
    }
}
