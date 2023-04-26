package ECommerce.MyProject.Controllers;

import ECommerce.MyProject.Models.Product;
import ECommerce.MyProject.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("product")
public class ProductsControllers<Products> {

    @Autowired
    ProductServices productService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Products> getAllProducts() {

        return (List<Products>) productService.getAllProducts();
    }
}
