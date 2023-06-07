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


    @Column(name = "reviewerName")
    String name;
    @Column(name = "reviewDate")
    String date;

    @Column(name = "reviewType")
    String type;

    @ManyToMany(mappedBy = "reviews")
    @JsonIgnore
    List<Product> product;


}
