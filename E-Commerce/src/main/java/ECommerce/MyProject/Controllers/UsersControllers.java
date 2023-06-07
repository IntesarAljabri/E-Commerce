package ECommerce.MyProject.Controllers;

import ECommerce.MyProject.Services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")

public class UsersControllers {

    @Autowired
    UsersServices userService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllUsers() {

        return userService.getAllUsers();

    }
}
