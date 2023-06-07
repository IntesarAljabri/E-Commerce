package ECommerce.MyProject.Services;

import ECommerce.MyProject.Repositories.ShippingAddressesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ShippingAddressesServices {

    @Autowired
    ShippingAddressesRepositories shippingRepositories;
    public List<ShippingAddressesServices> getAllShipping() {
        return shippingRepositories.findAll();
    }
    public Optional getAllShippingsAddresses (){
        return shippingRepositories.findById(getAllShippingsAddresses());
    }


}
