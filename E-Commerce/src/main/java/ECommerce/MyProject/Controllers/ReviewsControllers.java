package ECommerce.MyProject.Controllers;

import ECommerce.MyProject.Models.Ratings;
import ECommerce.MyProject.Models.Reviews;
import ECommerce.MyProject.Services.RatingsServices;
import ECommerce.MyProject.Services.ReviewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class ReviewsControllers {

    @Autowired
    ReviewsServices reviewService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Reviews> getAllRatings() {

        return (List<Reviews>) reviewService. getAllReviews();
    }
}


