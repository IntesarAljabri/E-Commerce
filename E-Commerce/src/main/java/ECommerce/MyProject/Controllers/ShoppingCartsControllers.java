package ECommerce.MyProject.Controllers;

import ECommerce.MyProject.Models.ShippingCarts;
import ECommerce.MyProject.Services.ShippingCartsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("shopping_Carts")
public class ShoppingCartsControllers {
        @Autowired
        private ShippingCartsServices shippingCartsServices;

        @GetMapping("/getAll")
        public List<ShippingCarts> getAllShippingCarts() {
            return shippingCartsServices.getAllShippings();
        }
    }


