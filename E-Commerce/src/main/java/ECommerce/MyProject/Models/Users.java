package ECommerce.MyProject.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Data
@Entity
@Table(name = "Users")
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "customerName")
    String name;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    List<Order> orders;

    @OneToOne(mappedBy = "user")
    @JsonIgnore
    List<ShippingCarts> shopping;

}
