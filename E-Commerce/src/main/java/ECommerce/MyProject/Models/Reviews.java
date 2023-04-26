package ECommerce.MyProject.Models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "reviewer_name")
    String name;
    @Column(name = "review_date")
    String date;

    @Column(name = "review_type")
    String type;

}
