package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Payments;
import ECommerce.MyProject.Models.Ratings;
import ECommerce.MyProject.Repositories.PaymentRepositories;
import ECommerce.MyProject.Repositories.RatingsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingsServices {
    @Autowired
    RatingsRepositories ratingRepositories;
    public List<Ratings> getAllRatings() {
        return ratingRepositories.findAll();
    }
    public Ratings getRatingsById(Integer id) {

        return ratingRepositories.findById(id).get();
    }
}
