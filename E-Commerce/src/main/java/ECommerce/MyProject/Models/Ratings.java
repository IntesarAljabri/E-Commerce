package ECommerce.MyProject.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
}
