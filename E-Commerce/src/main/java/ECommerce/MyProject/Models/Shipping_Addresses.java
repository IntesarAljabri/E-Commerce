package ECommerce.MyProject.Models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Shipping_Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "Shipping_location")
    String location;

    @Column(name = "shipping_Connector")
    long connector;

}
