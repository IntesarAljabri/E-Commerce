package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Reviews;
import ECommerce.MyProject.Models.ShippingCarts;
import ECommerce.MyProject.Repositories.ShippingCartsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping("/shipping")
@Service
public class ShippingCartsServices<ShippingsCarts> {
    @Autowired
    ShippingCartsRepositories shoppingRepositories;

    public Optional<ECommerce.MyProject.Models.ShippingCarts> getShoppingById(Long id) {
        return shoppingRepositories.findById(Math.toIntExact(id));
    }

    @Autowired
    private ShippingCartsServices shippingCartsServices;

    @GetMapping("/getAll")
    public List<ShippingCarts> getAllShippingCarts() {
        return shippingCartsServices.getAllShippingCarts();
    }
}
