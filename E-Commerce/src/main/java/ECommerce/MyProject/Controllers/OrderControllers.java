package ECommerce.MyProject.Controllers;

import ECommerce.MyProject.Models.Orders;
import ECommerce.MyProject.Services.OrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("orders")
public class OrderControllers {

    @Autowired
    OrdersServices orderServices;

    @GetMapping("all")
    public List<Orders> getAllMarkets() {
        return orderServices.getAllOrders();
    }
}

