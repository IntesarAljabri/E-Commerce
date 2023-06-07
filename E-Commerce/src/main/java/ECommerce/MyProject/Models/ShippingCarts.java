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
@Table(name = "ShoppingCarts")
public class ShippingCarts {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;

        @OneToMany(mappedBy = "ShoppingCarts")
        @JsonIgnore
        List<Users> user;


        @OneToMany(mappedBy = "ShoppingCarts")
        @JsonIgnore
        List<Product> product;
}