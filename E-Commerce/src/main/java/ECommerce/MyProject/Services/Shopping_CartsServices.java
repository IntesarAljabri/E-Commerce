package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Shopping_Carts;
import ECommerce.MyProject.Repositories.Shopping_CartsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Shopping_CartsServices {

    @Autowired
    Shopping_CartsRepositories shoppingRepositories;

    public List<Shopping_Carts> getAllShoppings() {
        return shoppingRepositories.findAll();
    }

    public Optional<Shopping_Carts> getShoppingById(Long id) {
        return shoppingRepositories.findById(Math.toIntExact(id));
    }


}
