package hu.tomicompany.prog4.sajatapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Bicycle extends Vehicle{
    private boolean bell;

    public Bicycle(Long id, int maxSpeed, String brand, boolean bell) {
        super(id, maxSpeed, brand);
        this.bell = bell;
    }
}
