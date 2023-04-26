package ECommerce.MyProject.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "reviews")
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

    @ManyToMany(mappedBy = "reviews")
    @JsonIgnore
    List<Product> product;


}
