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
@Table(name = "Shopping_carts")
public class Shopping_Carts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToMany(mappedBy = "Shopping_carts")
    @JsonIgnore
    List<Users> user;


    @OneToMany(mappedBy = "Shopping_carts")
    @JsonIgnore
    List<Product> product;

}
