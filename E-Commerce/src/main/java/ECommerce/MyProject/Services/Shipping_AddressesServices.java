package ECommerce.MyProject.Services;

import ECommerce.MyProject.Repositories.Shipping_AddressesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Shipping_AddressesServices {

    @Autowired
    Shipping_AddressesRepositories shippingRepositories;
    public List<Shipping_AddressesServices> getAllShipping() {
        return shippingRepositories.findAll();
    }
    public Optional getAllShippings_Addresses (){
        return shippingRepositories.findById(getAllShippings_Addresses());
    }

}
