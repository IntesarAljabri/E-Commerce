package ECommerce.MyProject.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "Shopping_carts")
public class Shopping_Carts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

}
