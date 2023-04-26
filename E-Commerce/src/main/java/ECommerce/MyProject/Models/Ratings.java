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
@Table(name = "ratings")
public class Ratings {

    @Column(name = "level_score")
    Integer score;

    @Column(name = "date")
    String date;

    @OneToMany(mappedBy = "ratings")
    @JsonIgnore
    List<Product> product;

}
