package ECommerce.MyProject.Controllers;

import ECommerce.MyProject.Models.Orders;
import ECommerce.MyProject.Models.Payments;
import ECommerce.MyProject.Services.OrdersServices;
import ECommerce.MyProject.Services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("Payment")
public class PaymentControllers {
    @Autowired
    PaymentServices paymentServices;

    @GetMapping("all")
    public List<Payments> getAllMarkets() {
        return paymentServices.getAllPayments();
    }
}
