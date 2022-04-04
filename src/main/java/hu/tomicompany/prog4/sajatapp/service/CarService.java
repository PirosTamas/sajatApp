package hu.tomicompany.prog4.sajatapp.service;

import hu.tomicompany.prog4.sajatapp.model.Car;

import java.util.logging.Logger;

public class CarService implements Service<Car> {
    private Logger log = Logger.getLogger(this.getClass().getName());


    @Override
    public void pay(Car vehicle) {
        log.info("Paid for car hopp: " + vehicle);

    }
}
