package ECommerce.MyProject.Controllers;

import ECommerce.MyProject.Services.ShippingAddressesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("Shipping")
public class ShippingAddressesControllers {

    @Autowired
    ShippingAddressesServices shippingServices;

    @GetMapping("all")
    public Optional getAllShippingAddresses() {
        return shippingServices.getAllShippingsAddresses();
    }
}
