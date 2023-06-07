package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Product;
import ECommerce.MyProject.Repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServices {
    @Autowired
    ProductRepositories productRepositories;
    public List<Product> getAllItems() {
        return productRepositories.findAll();
    }
    public Product getAllProducts (){
        return productRepositories.findById(getAllProducts().getId()).get();
    }
}
