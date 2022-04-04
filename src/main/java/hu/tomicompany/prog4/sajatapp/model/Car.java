package hu.tomicompany.prog4.sajatapp.model;

import hu.tomicompany.prog4.sajatapp.exception.NoTransmissionException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
public class Car extends Vehicle{

    private String transmission;

    public Car(Long id, int maxSpeed, String brand, String transmission) throws NoTransmissionException {
        super(id, maxSpeed, brand);
        if(transmission == "manual" || transmission =="automatic")
            this.transmission = transmission;
        else
        {
            throw new NoTransmissionException("Nincs ilyen váltó barom!");
        }
    }
}
