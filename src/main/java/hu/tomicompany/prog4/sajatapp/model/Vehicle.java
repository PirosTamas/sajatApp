package hu.tomicompany.prog4.sajatapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Vehicle {

    private Long id;
    private int maxSpeed;
    private String brand;

}
