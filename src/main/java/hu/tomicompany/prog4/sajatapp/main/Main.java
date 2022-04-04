package hu.tomicompany.prog4.sajatapp.main;

import hu.tomicompany.prog4.sajatapp.controller.Control;
import hu.tomicompany.prog4.sajatapp.exception.NoTransmissionException;
import hu.tomicompany.prog4.sajatapp.model.Bicycle;
import hu.tomicompany.prog4.sajatapp.model.Car;
import hu.tomicompany.prog4.sajatapp.service.CarService;


public class Main {

    public static void main(String[] args) throws NoTransmissionException {
        Control control = new Control();
        control.start();
    }
}
