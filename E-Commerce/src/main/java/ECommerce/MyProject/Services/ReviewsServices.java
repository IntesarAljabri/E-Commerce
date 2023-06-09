package ECommerce.MyProject.Services;

import ECommerce.MyProject.Models.Reviews;
import ECommerce.MyProject.Repositories.ReviewsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewsServices {

    @Autowired
    ReviewsRepositories reviewRepositories;
    public List<Reviews> getAllReviews() {
        return reviewRepositories.findAll();
    }
    public Reviews getReviewsById(Integer id) {

        return reviewRepositories.findById(id).get();
    }
}
