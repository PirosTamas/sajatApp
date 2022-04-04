package hu.tomicompany.prog4.sajatapp.service;
import hu.tomicompany.prog4.sajatapp.model.Bicycle;
import java.util.logging.Logger;

public class BicycleService implements Service<Bicycle>{
    private Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void pay(Bicycle vehicle) {
        log.info("Paid for bicycle: " + vehicle);

    }
}
