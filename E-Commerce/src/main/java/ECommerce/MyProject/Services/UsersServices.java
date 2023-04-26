package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Users;
import ECommerce.MyProject.Repositories.UsersRepositories;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServices {

    @Autowired
    UsersRepositories userRepositories;
    //        public List<Customer> getAllCustomers() {
//            return customerRepositories.findAll();
//        }
    public List<Users> getAllUsers() {

        return userRepositories.findAll();
    }

    public User getMarketById(Integer id) {

        return (User) userRepositories.findById(id).get();
    }

}
