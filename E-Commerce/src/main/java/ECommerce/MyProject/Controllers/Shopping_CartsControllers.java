package ECommerce.MyProject.Controllers;


import ECommerce.MyProject.Services.Shopping_CartsServices;
import ECommerce.MyProject.Services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("shopping_Carts")
public class Shopping_CartsControllers {
    @Autowired
    Shopping_CartsServices shoppingService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllShopping() {

        return shoppingService.getAllShoppings();

    }

}
