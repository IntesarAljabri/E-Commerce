package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Orders;
import ECommerce.MyProject.Repositories.OrdersRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersServices {

    @Autowired
    OrdersRepositories orderRepositories;

    public List<Orders> getAllOrders() {
        return orderRepositories.findAll();
    }
    public List<Orders> getAllInvoices() {

        return orderRepositories.findAll();
    }

    public Orders getOrdertById(Integer id) {

        return orderRepositories.findById(id).get();
    }

}
