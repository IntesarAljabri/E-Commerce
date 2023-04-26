package ECommerce.MyProject.Controllers;

import ECommerce.MyProject.Models.Ratings;
import ECommerce.MyProject.Services.ProductServices;
import ECommerce.MyProject.Services.RatingsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ratings")
public class RatingsControllers {
    @Autowired
    RatingsServices ratingService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Ratings> getAllRatings() {

        return (List<Ratings>) ratingService.getAllRatings();
    }


}
