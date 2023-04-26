package ECommerce.MyProject.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;

import java.util.List;

public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "customer_name")
    String name;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    List<Order> orders;

    @OneToOne(mappedBy = "user")
    @JsonIgnore
    List<Shopping_Carts> shopping;

}
